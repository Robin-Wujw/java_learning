import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：整合配置文件
 * @Author: Robin_Wujw
 * @Date: 2022-05-21 20:53
 */
public class Server07 {
    private ServerSocket serverSocket;
    public static void main(String[] args) {
        Server07 server = new Server07();
        server.start();
    }
    //启动服务
    public void start(){
        try {
            serverSocket = new ServerSocket(8888);
            receive();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务器启动失败");
        }

    }
    //接受连接处理
    public void receive(){
        try {
            Socket client = serverSocket.accept();
            System.out.println("一个客户端建立了连接");
            //获取请求协议
            Request3 request = new Request3(client);

            Response1 response = new Response1(client);

            Servlet1 servlet = WebApp.getServletFromUrl(request.getUrl());
            if(null!=servlet){
                servlet.service(request,response);
                //关注了状态码
                response.pushToBrowser(200);
            }else{
                //错误
                response.pushToBrowser(404);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("客户端错误");
        }
    }
    //停止服务
    public void stop(){

    }
}
