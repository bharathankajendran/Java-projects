package com.Aspire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnect{
	public void Connection() throws SQLException {
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234abc");
		 Statement statement=connection.createStatement();
		 statement.executeUpdate("create  database  CRM");
    	 System.out.println("Database created successsfully..");
//		 String mysql="use Admin";
//	     String table="create table Market(productId Integer,proName varchar(30),rate Integer);";
//		 String tableinsert="insert into Market values('001','flowerpot','250');";
//		 String tableview="select * from Market";
//		 PreparedStatement prepareStatement = connection.prepareStatement(tableview);
//		 ResultSet resultSet = prepareStatement.executeQuery();
//		 System.out.println("Data Retrived.......");
//		 System.out.println("productId"+"\t"+"porName"+"\t"+"rate");
//		 while(resultSet.next())
//		 {
//			 int Id=resultSet.getInt("productId");
//			 String Name=resultSet.getString("proName");
//			 int rate=resultSet.getInt("rate");
//			 System.out.println(Id+"\t"+Name+"\t"+rate);
//		 }
		 }
		catch (ClassNotFoundException o)
		 {
		 System.out.println("Exception Handeled....");
		 
		 }
}
}