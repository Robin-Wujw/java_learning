package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-31 22:56
 */

/*
urlPattern配置规则
4.任意匹配： / 或者 /*
/ 是覆盖掉DefaultServlet 会把静态资源(比如a.html)覆盖掉，访问不了
/* 意味着匹配任意访问路径
精确路径 > 目录路径 > 扩展名路径 > /* > /

/*比/优先级高
 */
@WebServlet(urlPatterns = {"/*"})
public class ServletDemo11 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo11 get.......");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
