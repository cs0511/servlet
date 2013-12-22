package com.csong.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chensong", "root", "chensong");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from chensong");
			while (rs.next()) {
				System.out.println(rs.getString("name") + "\t" + rs.getInt("id"));
			}
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println( "Hello World!" );
			e.printStackTrace();
		}
        System.out.println( "Hello World!" );
    }
}
