package com.fujitsu.wow.sqlserver;

import java.sql.*;

public class Data {
    public static void main(String[] args) {
        try {
            //加载数据库驱动，注册到驱动管理器
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            // 数据库连接字符串
            String conn = "jdbc:sqlserver://10.167.23.70:1433;DatabaseName=WINCARE2";
            // 数据库用户名
            String username = "sa";
            // 数据库密码
            String passW = "Zpm672168300";


            // 创建Connection连接
            Connection Conn = DriverManager.getConnection(conn, username, passW);
            System.out.println("连接数据库成功");


            // 获取Statement
            Statement stmt = Conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //查询语句
            String query = "SELECT * FROM [dbo].[bumon] ";
            Conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


            //执行查询
            ResultSet rs = stmt.executeQuery(query);
            System.out.println( "rs = " + rs );
            String list = "";
            if (rs.first()) {
                System.out.println(rs.getString(1));
                list = rs.getString(1);
            }

        } catch (Exception e) {
            throw new RuntimeException("数据库连接失败！"+ e);
        }
    }
}
