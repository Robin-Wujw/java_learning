import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-05-23 15:07
 */
public class Response1 {
    private BufferedWriter bw;
    //正文
    private StringBuilder content;
    //协议头(状态行与请求头 回车)信息
    private StringBuilder headInfo;
    private int len;//正文的字节数
    private final String BLANK = " ";
    private final String CRLF  = "\r\n";
    private Response1(){
        content = new StringBuilder();
        headInfo = new StringBuilder();
        len = 0;
    }
    public Response1(Socket client){
        this();
        try {
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            headInfo = null;
        }
    }
    public Response1(OutputStream os){
        this();
        bw = new BufferedWriter(new OutputStreamWriter(os));
    }
    //动态添加内容
    public Response1 print(String info){
        content.append(info);
        len+=(info).getBytes().length;
        return this;
    }
    public Response1 println(String info){
        content.append(info).append(CRLF);
        len+=(info+CRLF).getBytes().length;
        return this;
    }
    //推送相应信息
    public void pushToBrowser(int code) throws IOException {
        if(null == headInfo){
            code = 505;
        }
        createHeadInfo(code);
        bw.append(headInfo);
        bw.append(content);
        bw.flush();
    }
    //构建头信息
    private void createHeadInfo(int code){
        //1.响应行：HTTP/1.1 200 OK
        headInfo.append("HTTP/1.1").append(BLANK);
        headInfo.append(code).append(BLANK);
        switch(code){
            case 200:
                headInfo.append("OK").append(CRLF);
                break;
            case 404:
                headInfo.append("Not Found").append(CRLF);
                break;
            case 505:
                headInfo.append("SERVER ERROR").append(CRLF);
                break;
        }
        //2.响应头(最后一行存在空行):
        headInfo.append("Date:").append(new Date()).append(CRLF);
        headInfo.append("Server:").append("Server/0.0.1;charset=GBK").append(CRLF);
        headInfo.append("Content-type:text/html").append(CRLF);
        headInfo.append("Content-length:").append(len).append(CRLF);
        headInfo.append(CRLF);
    }
}
