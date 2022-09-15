/**
 * @Author: Robin_Wujw
 * @Date: 2022-05-20 20:13
 */
public class OthersServlet implements Servlet1{
    @Override
    public void service(Request3 request, Response1 response) {
        //关注了内容
        response.print("其他测试页面");
    }
}
