package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-28 17:02
 */

@WebServlet(urlPatterns = "/demo2",loadOnStartup = 1)
public class ServletDemo2 implements Servlet {
    private ServletConfig config;
    /*
    初始化方法
    1.调用时机：默认情况下，Servlet被第一次访问时调用
        *loadOnStartup
    2.调用次数：只调用一次
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("init.....");
    }
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    /*
    提供服务
    1.调用时机：每一次Servlet被访问时调用
    2.调用次数：多次
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet Hello World!");
    }

    /*
     销毁方法
     1.调用时机：内存释放或者服务器关闭的时候，Servlet对象会被销毁，调用
     2.调用次数：1次
     */
    @Override
    public void destroy() {
        System.out.println("destroy......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

}
