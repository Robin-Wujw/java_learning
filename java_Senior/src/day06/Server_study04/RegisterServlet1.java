/**
 * @Author: Robin_Wujw
 * @Date: 2022-05-20 20:14
 */
public class RegisterServlet1 implements Servlet1{
    @Override
    public void service(Request3 request, Response1 response) {
        //关注业务逻辑
        String uname = request.getParameter("uname");
        String[] favs = request.getParameterValues("fav");

        response.print("<html>");
        response.print("<head>");
        response.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        response.print("<title>");
        response.print("注册成功");
        response.print("</title>");
        response.print("</head>");
        response.println("你注册的信息为："+ uname);
        response.println("你喜欢的类型为：");
        for(String v:favs){
            if(v.equals("0")){
                response.print("萝莉型");
            }else if(v.equals("1")){
                response.print("豪放型");
            }else if(v.equals("2")){
                response.print("经济节约型");
            }
        }
        response.print("<body>");
        response.print("欢迎回来" + request.getParameter("uname"));
        response.print("</body>");
        response.print("</html>");

    }
}
