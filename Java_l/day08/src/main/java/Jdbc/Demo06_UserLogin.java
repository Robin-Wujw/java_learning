package Jdbc;


import org.junit.Test;

import java.sql.*;

/**
 * Api讲解 Statement
 * @Author: Robin_Wujw
 * @Date: 2022-07-13 17:26
 */
public class Demo06_UserLogin {

    @Test
    public void testLogin() throws Exception {
        //加载驱动类
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
        String username = "root";
        String password = "wujiawei";
        //获取连接
        Connection conn =  DriverManager.getConnection(
                url,username,password);

        //接收用户输入的用户名和密码
        String name = "张三";
        String pwd  = "213";
        //获取执行sql对象
        Statement stmt =  conn.createStatement();
        //定义sql语句
        String sql = "select * from t_user where username='"+name+"' and pwd = '"+pwd+"';";
        //执行sql
        ResultSet rs =  stmt.executeQuery(sql);
        //处理返回结果
        if(rs.next()){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
        //释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
    /*
    演示sql注入
     */
    @Test
    public void testLogin_Inject() throws Exception {
        //加载驱动类
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
        String username = "root";
        String password = "wujiawei";
        //获取连接
        Connection conn = DriverManager.getConnection(
                url, username, password);

        //接收用户输入的用户名和密码
        String name = "sdas三";
        String pwd = "'or'1'='1";
        //获取执行sql对象
        Statement stmt = conn.createStatement();
        //定义sql语句
        String sql = "select * from t_user where username='" + name + "' and pwd = '" + pwd + "';";
        System.out.println(sql);
        //执行sql
        ResultSet rs = stmt.executeQuery(sql);
        //处理返回结果
        if (rs.next()) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        //释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
}


