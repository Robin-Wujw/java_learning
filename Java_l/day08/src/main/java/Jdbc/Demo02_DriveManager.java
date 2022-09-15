package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Api讲解 DriveManager
 * @Author: Robin_Wujw
 * @Date: 2022-07-13 17:26
 */
public class Demo02_DriveManager {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动类 可以省略了
        //Class.forName("com.mysql.cj.jdbc.Driver");

        //建立连接(连接对象内部其实包含了一个Socket对象，是一个远程的连接
        // 比较耗时！这是connection对象管理的要点！真正开发中为了提高效率
        // 都会使用连接池来  管理连接对象)
        //如果连接的是本机mysql并且连接的端口是默认的3306 可以简化 去掉则为三个/
        //jdbc:mysql:///testjdbc
        String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
        String username = "root";
        String password = "wujiawei";
        //获取连接
        Connection conn =  DriverManager.getConnection(
                url,username,password);
        //DriverManager  注册驱动、获取数据库连接

        //Connection : 获取执行sql的对象 、 管理事务
        /* 获取执行sql的对象
        普通执行sql对象 Statement createStatement()
        预编译Sql的执行sql对象： 防止sql注入 PreparedStatement prepareStatement(sql)
        执行存储过程的对象 CallableStatement prepareCall(sql)
         */
        /*事务管理
          MySQL 事务管理
          开启事务： BEGIN; /START TRANSACTION;
          提交事务： COMMIT;
          回滚事务： ROLLBACK;
          MySQL 默认自动提交事务

          JDBC事务管理： Connection接口定义了三个对应的方法
          开启事务 setAutoCommit(boolean autoCommit): true为自动提交事务;false为手动提交事务，即开启事务
          提交事务 commit()
          回滚事务 rollback()
         */
    }
}
