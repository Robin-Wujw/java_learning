/**
 * @Author: Robin_Wujw
 * @Date: 2022-05-20 20:13
 */
public class LoginServlet1 implements Servlet1{
    @Override
    public void service(Request3 request, Response1 response) {
        //关注了内容
        response.print("<html>");
        response.print("<head>");
        response.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        response.print("<title>");
        response.print("第一个servlet");
        response.print("</title>");
        response.print("</head>");
        response.print("<body>");
        response.print("欢迎回来" + request.getParameter("uname"));
        response.print("</body>");
        response.print("</html>");
    }
}
