import java.io.IOException;
import java.net.Socket;

/**
 * 分发器
 * @Author: Robin_Wujw
 * @Date: 2022-06-09 18:39
 */
public class Dispatcher implements Runnable{
    private Socket client;
    private Request3 request;
    private Response1 response;
    public Dispatcher(Socket client){
        this.client = client;
        try {
            //获取请求协议
            //获取响应协议
            request = new Request3(client);
            response = new Response1(client);
        } catch (IOException e) {
            e.printStackTrace();
            this.release();
        }
    }
    @Override
    public void run() {
        try{
        //获取请求协议
        Servlet1 servlet = WebApp.getServletFromUrl(request.getUrl());
        if(null!=servlet){
            servlet.service(request,response);
            //关注了状态码
            response.pushToBrowser(200);
        }else{
            //错误
            response.pushToBrowser(404);
        }
        }catch(Exception e){
            try {
                response.pushToBrowser(500);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        release();
    }
    //释放资源
    private void release(){
        try {
            client.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
