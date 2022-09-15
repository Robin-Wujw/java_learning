package Jdbc;



import org.junit.Test;
import pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Api讲解 ResultSet
 * @Author: Robin_Wujw
 * @Date: 2022-07-13 17:26
 */
public class Demo05_ResultSet {

    /*
    执行DQL
     */

    @Test
    public void testResultSet() throws Exception {
        //加载驱动类
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
        String username = "root";
        String password = "wujiawei";
        //获取连接
        Connection conn =  DriverManager.getConnection(
                url,username,password);
        System.out.println(conn);
        //获取执行sql对象
        Statement stmt =  conn.createStatement();
        //定义sql语句
        String sql = "select * from t_user;";
        //执行sql
        ResultSet rs = stmt.executeQuery(sql);
        //处理返回结果
        while(rs.next()){//光标向下移动一行 判断当前行是否有数据
            int id = rs.getInt("id");
            String name = rs.getString("username");
            String pwd = rs.getString(3);
            Timestamp t  = rs.getTimestamp(4);
            System.out.println(id);
            System.out.println(name);
            System.out.println(pwd);
            System.out.println(t);

            System.out.println("-------------------");
        }
        //释放资源
        rs.close();
        stmt.close();
        conn.close();
        /*
        Statement 作用 ： 执行sql语句

        int executeUpdate(sql) 执行DML、DDL语句
        ResultSet executeQuery(sql) 执行DQL语句
         */

    }
    /*
    查询User表数据，封装在User对象中，并且存储到ArrayList集合中
    1.定义实体类User
    2.查询数据，封装到对象中
    3.将User对象存入ArrayList集合中
     */
    @Test
    public void testResultSet2() throws Exception {
        //加载驱动类
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
        String username = "root";
        String password = "wujiawei";
        //获取连接
        Connection conn =  DriverManager.getConnection(
                url,username,password);
        System.out.println(conn);
        //获取执行sql对象
        Statement stmt =  conn.createStatement();
        //定义sql语句
        String sql = "select * from t_user;";
        //执行sql
        ResultSet rs = stmt.executeQuery(sql);
        //处理返回结果
        List<User> list = new ArrayList<>();
        while(rs.next()){//光标向下移动一行 判断当前行是否有数据
            User user = new User();
            int id = rs.getInt("id");
            String name = rs.getString("username");
            String pwd = rs.getString(3);
            Timestamp t  = rs.getTimestamp(4);

            user.setId(id);
            user.setName(name);
            user.setPwd(pwd);
            user.setTime(t);
            list.add(user);
        }
        System.out.println(list);
        //释放资源
        rs.close();
        stmt.close();
        conn.close();
        /*
        Statement 作用 ： 执行sql语句

        int executeUpdate(sql) 执行DML、DDL语句
        ResultSet executeQuery(sql) 执行DQL语句
         */

    }


}
