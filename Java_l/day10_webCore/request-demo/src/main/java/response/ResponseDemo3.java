package response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-03 22:16
 */
/*
响应字符数据：设置字符数据的响应体
 */
@WebServlet("/resp3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");//中文乱码问题
        //1.获取字符输出流
        PrintWriter writer = resp.getWriter();
        //content-type
        //resp.setHeader("content-type","text/html");
        writer.write("你好");
        writer.write("<h1>bbbbb</h1>");

        //细节：流不需要关闭
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
