package response;

import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-03 22:16
 */
/*
响应字节数据：设置字节数据的响应体
 */
@WebServlet("/resp4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1.读取文件
        FileInputStream fis =  new FileInputStream("C:\\Users\\Robin\\Pictures\\Saved Pictures\\系统壁纸.jpg");
        //2.获取response字节输出流
        ServletOutputStream os = resp.getOutputStream();
        //3.完成流的copy
//        byte[] buff = new byte[1024];
//        int len = 0;
//        while((len=fis.read(buff))!=-1){
//            os.write(buff,0,len);
//        }
        IOUtils.copy(fis,os);
        fis.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
