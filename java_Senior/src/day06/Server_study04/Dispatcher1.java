import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 分发器：加入状态内容处理 404 505及首页
 * @Author: Robin_Wujw
 * @Date: 2022-06-09 18:39
 */
public class Dispatcher1 implements Runnable{
    private Socket client;
    private Request3 request;
    private Response1 response;
    public Dispatcher1(Socket client){
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
        if(null==request.getUrl()||request.getUrl().equals("")){
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("index.html");
            response.print((new String(is.readAllBytes())));
            response.pushToBrowser(200);
            is.close();
            return;
        }
        //获取请求协议
        Servlet1 servlet = WebApp.getServletFromUrl(request.getUrl());
        if(null!=servlet){
            servlet.service(request,response);
            //关注了状态码
            response.pushToBrowser(200);
        }else{
            //错误
            InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("error.html");
            response.print((new String(is.readAllBytes())));
            response.pushToBrowser(404);
            is.close();
        }
        }catch(Exception e){
            try {
                response.println("你好我不好，我会马上好");
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
