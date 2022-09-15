package servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-31 22:30
 */
public class ServletDemo4 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //根据请求方式的不同进行分别的处理
        HttpServletRequest request = (HttpServletRequest) req;
         //1.获取请求方式
        String method = request.getMethod();
        //2.判断
        if("GET".equals(method)){
            //get方式的处理逻辑
        } else if ("POST".equals(method)) {
            //post方式的处理逻辑
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
