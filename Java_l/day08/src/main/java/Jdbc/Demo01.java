package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc快速入门
 * @Author: Robin_Wujw
 * @Date: 2022-07-12 22:07
 */
public class Demo01 {
    public static void main(String[] args) {
        try {
            //加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            long start = System.currentTimeMillis();
            //建立连接(连接对象内部其实包含了一个Socket对象，是一个远程的连接
            // 比较耗时！这是connection对象管理的要点！真正开发中为了提高效率
            // 都会使用连接池来  管理连接对象)
            String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
            String username = "root";
            String password = "wujiawei";
            //获取连接
            Connection conn =  DriverManager.getConnection(
                    url,username,password);
            long end = System.currentTimeMillis();
            System.out.println(conn);
            System.out.println("建立连接，耗时:"+(end-start)+"ms毫秒");
            //获取执行sql对象
            Statement stmt =  conn.createStatement();
            //定义sql语句
            String sql = "update t_user set pwd = \"213\"where id = 1 ";
            //执行sql
            int  count = stmt.executeUpdate(sql); //返回受影响的行数
            //处理返回结果
            System.out.println(count);
            //释放资源
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}