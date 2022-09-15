package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Api讲解 Connection
 * @Author: Robin_Wujw
 * @Date: 2022-07-13 17:26
 */
public class Demo03_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testjdbc?useSSL=false";
        String username = "root";
        String password = "wujiawei";

        Connection conn =  DriverManager.getConnection(
                url,username,password);
        //定义sql
        String sql1 = "update t_user set pwd = \"21322\"where id = 2 ";
        String sql2 = "update t_user set pwd = \"213222\"where id = 3 ";
        Statement stmt = conn.createStatement();

        try{
        //开启事务
        conn.setAutoCommit(false);
        int count1 = stmt.executeUpdate(sql1);
        System.out.println(count1);

        int count2 = stmt.executeUpdate(sql2);
        System.out.println(count2);
        conn.commit();
        //提交事务
        }catch (Exception throables){
            //回滚事务
            conn.rollback();
            throables.printStackTrace();
        }

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
