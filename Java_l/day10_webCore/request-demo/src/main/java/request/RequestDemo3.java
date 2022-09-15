package request; /**
 * @Author: Robin_Wujw
 * @Date: 2022-08-03 16:35
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
中文乱码问题解决方案
 */

@WebServlet("/req3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //2.解决乱码: POST     getReader()
       // request.setCharacterEncoding("UTF-8");//设置字符输入流的编码

        String username = request.getParameter("username");
        System.out.println("解决乱码前:"+username);

        //3.GET 方式  获取参数的方式： getQueryString
        //乱码原因：tomcat进行URL解码，默认的字符集ISO-8859-1
        //3.1 先对乱码数据进行编码：转为字节数组
        byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);
        //3.2字节数组借码
        username = new String(bytes,StandardCharsets.UTF_8);
        System.out.println("解决乱码后:"+username);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
