package Jdbc;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Api讲解 Statement
 * @Author: Robin_Wujw
 * @Date: 2022-07-13 17:26
 */
public class Demo04_Statement {

    @Test
    public void testDML() throws Exception {
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
        String sql = "update t_user set pwd = \"213\"where id = 1 ";
        //执行sql
        int  count = stmt.executeUpdate(sql); //执行完DML语句后，返回受影响的行数
        //处理返回结果
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();
        /*
        Statement 作用 ： 执行sql语句

        int executeUpdate(sql) 执行DML、DDL语句
        ResultSet executeQuery(sql) 执行DQL语句
         */

    }


}
