package Jdbc;


import org.junit.Test;

import java.sql.*;

/**
 * Api讲解 Statement
 * @Author: Robin_Wujw
 * @Date: 2022-07-13 17:26
 */
public class Demo07_PreparedStatement {

    /*
    演示sql注入
     */
    @Test
    public void testLogin_PreparedStatement() throws Exception {
        //加载驱动类
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
        String username = "root";
        String password = "wujiawei";
        //获取连接
        Connection conn = DriverManager.getConnection(
                url, username, password);

        //接收用户输入的用户名和密码
        String name = "张三";
        String pwd = "213";
        //获取执行sql对象
        //定义sql语句
        String sql = "select * from t_user where username= ? and pwd =?;";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1,name);
        pstmt.setString(2,pwd);
        //执行sql
        ResultSet rs = pstmt.executeQuery();
        //处理返回结果
        if (rs.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        //释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }
}



