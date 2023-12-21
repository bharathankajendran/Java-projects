package com.Aspire;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class CaseData extends UserOffice{
	String Gender;
	Scanner details=new Scanner(System.in);
	//######################################################## ACCUED DETAILS#########################################################
	public void Accused() throws SQLException{
		String AccusedName;
		String ComplaintDetails;
		String BodyDetails;
		String  Address;
		long AatharCard;
		
		System.out.println("Enter the AccusedID  : ");
		int AccusedId=details.nextInt();
		details.nextLine();
		System.out.println("Enter the CaseID: ");
		int caseId =details.nextInt();
		details.nextLine();
		System.out.println("Enter the Accused Name : ");
		 AccusedName =details.nextLine();
		 details.nextLine();
		System.out.println("Enter the Gender : ");
		 Gender  =details.nextLine();
		 details.nextLine();
		System.out.println("Enter the Subject complaint Details : ");
		 ComplaintDetails  =details.nextLine();
		 details.nextLine();
		System.out.println("Enter the Person Body Details : ");
		BodyDetails =details.nextLine();	
		details.nextLine();
		System.out.println("Enter the Address : ");
		 Address =details.nextLine();
		 details.nextLine();
		System.out.println("Enter the AAdhar Card Details : ");
		AatharCard =details.nextLong();
		details.nextLine();
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
		 String querry="insert into Accused values(?,?,?,?,?,?,?,?);";
		 PreparedStatement pst=(PreparedStatement) connection.prepareStatement(querry);
		 ResultSet resultSet=pst.executeQuery(querry);
		 pst.setInt(1,AccusedId);
		 pst.setInt(2,caseId);
		 pst.setString(3,AccusedName);
		 pst.setString(4,Gender);
		 pst.setString(5,ComplaintDetails);
		 pst.setString(6,BodyDetails);
		 pst.setString(7,Address);
		 pst.setLong(8,AatharCard);
		 connection.close();
		 
		}
		catch(ClassNotFoundException o)
		 {
		 System.out.println("Exception Handeled....");
		 
		 }
	}

	public void AccusedDelete() throws SQLException {
		String tablename;
		int caseId;
		tablename=details.nextLine();
		caseId=details.nextInt();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
			 String querry="DELETE from ? where accused.caseId=?;";
			 PreparedStatement pst=connection.prepareStatement(querry);
			 pst.setString(1,tablename);
			 pst.setInt(2, caseId);
			 pst.executeQuery(querry);
			 System.out.println("Deleted Successfully..... ");
			 connection.close();
			}
			catch(ClassNotFoundException o)
			 {
			 System.out.println("Exception Handeled....");
			 }
		}
	//########################################################## OFFICER DETAILS#########################################################
	public void OfficerCode() throws SQLException{
		int OfficerID;
		String OfficerName;
		String OfficerPosition;
		String Station;
		String HandeledCase;
		String Address;
		String Reports;
		
		
		System.out.println("Enter the OfficerID  : ");
		OfficerID=details.nextInt();
		details.nextLine();
		System.out.println("Enter the OfficerName: ");
		OfficerName =details.nextLine();
		details.nextLine();
		System.out.println("Enter the OfficerPosition : ");
		 OfficerPosition =details.nextLine();
		 details.nextLine();
		System.out.println("Enter the Officer Station: ");
		 Station=details.nextLine();
		 details.nextLine();
		System.out.println("Enter the Handeled case : ");
		HandeledCase=details.nextLine();
		details.nextLine();
		System.out.println("Enter the Address : ");
		Address=details.nextLine();	
		details.nextLine();
		System.out.println("Enter the Reports: ");
		 Reports=details.nextLine();
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm ","root","1234abc");
			 String querry="insert into  Officer values(?,?,?,?,?,?,?);";
			 PreparedStatement pst=connection.prepareStatement(querry);

			 pst.setInt(1,OfficerID);
			 pst.setString(2,OfficerName);
			 pst.setString(3,OfficerPosition);
			 pst.setString(4,Station);
			 pst.setString(5,HandeledCase);
			 pst.setString(6,Address);
			 pst.setString(7,Reports);
			 pst.executeUpdate();
			 System.out.println("Added Successfully..... ");
			 
			 connection.close();
			}
			catch(ClassNotFoundException o)
			 {
			 System.out.println("Exception Handeled....");
			 
			 }
	}
	
	//############################################################# REGISTRATION ################################################################
	public void registration() throws SQLException {
		String ComplaintName;
		String Gender;
		String ComplaintDetails;
		String subjectDetail;
		long  Phonenumber;
		String Discription;
	
	System.out.println("Enter the Case Id : ");
		int CaseID=details.nextInt();
	System.out.println("Enter the Complainant Name : ");
	 ComplaintName=details.nextLine();
	 details.nextLine();
	System.out.println("Enter the Gender : ");
	Gender=details.nextLine();
	details.nextLine();
	System.out.println("Enter the Subject Details: ");
	ComplaintDetails=details.nextLine();
	details.nextLine();
	System.out.println("Enter the complaint Details : ");
	subjectDetail=details.nextLine();
	details.nextLine();
	System.out.println("Enter the Phone number: ");
	Phonenumber=details.nextLong();
	details.nextLine();
	System.out.println("Enter the Discription : ");
	Discription=details.nextLine();
	
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String querry="insert into  registration values(?,?,?,?,?,?,?);";
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
		 PreparedStatement pst=connection.prepareStatement(querry);
		 pst.setInt(1, CaseID);
		 pst.setString(2,ComplaintName);
		 pst.setString(3,Gender);
		 pst.setString(4,subjectDetail);
		 pst.setString(5,ComplaintDetails);
		 pst.setLong(6,Phonenumber);
		 pst.setString(7,Discription);
		 System.out.println("Added Successfully..... ");
		 connection.close();
		}
		catch(ClassNotFoundException o)
		 {
		 System.out.println("Exception Handeled....");
		 }
	}
	
	//####################################################### CASE DETAILS  ################################################3
	
	void CaseDetails() throws SQLException {
		System.out.println("Enter the caseID  : ");
		int CaseId=details.nextInt();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 String querry="select  registration.ComplaintName, registration.ComplaintDetails, registration.SubjectDetail,accused.AccusedID,accused.AccusedName,accused.ComplaintDetails,accused.BodyDetails from registration INNER JOIN accused on registration.CaseId=registration.CaseId where registration.CaseId=?;";
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
			 PreparedStatement pst=connection.prepareStatement(querry);
			 pst.setInt(1, CaseId);
			 ResultSet resultSet= pst.executeQuery();
			 while(resultSet.next()) {
				 System.out.print(" ComplaintName : "+resultSet.getString(1));
				 System.out.print(" ComplaintDetails : "+resultSet.getString(2));
				 System.out.print(" SubjectDetails : "+resultSet.getString(3));
				 System.out.print(" AccusedId : "+resultSet.getInt(4));
				 System.out.print(" AccuusedName : "+resultSet.getString(5));
				 System.out.print(" ComplaintDetails : "+resultSet.getString(6));
				 System.out.print(" bodyDetails : "+resultSet.getString(7));

			 }
			 pst.executeUpdate();
			 connection.close();
			}
			catch(ClassNotFoundException o)
			 {
			 System.out.println("Exception Handeled....");
			 }
		}
	
	public void OfficerDelete() throws SQLException {
		int OfficerId;
		System.out.print("Enter Which officer wants delete ?..Officer Id ?...");
		OfficerId=details.nextInt();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 String querry="DELETE from officer where officer.OfficerID=?;";
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
			 PreparedStatement pst=connection.prepareStatement(querry);
			 pst.setInt(1, OfficerId);
			 System.out.println(".............................................................Deleted Successfully................................................................ ");
			 pst.executeUpdate();
			 connection.close();
			}
			catch(ClassNotFoundException o)
			 {
			 System.out.println("Exception Handeled....");
			 }
		}
	public void OfficerView() throws SQLException {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
			 String querry="select *from Officer;";
			 PreparedStatement pst=connection.prepareStatement(querry);
			 System.out.println("....................................................................	OFFICERS DETAILS.........................................................");
			 ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()) {
				 System.out.print(" Officer  Id : "+resultSet.getInt(1));
				 System.out.print(" Officer Name : "+resultSet.getString(2));
				 System.out.print(" Officer Posistion : "+resultSet.getString(3));
		    	System.out.print(" Handeled Case : "+resultSet.getString(4));
	     		 System.out.print(" Address : "+resultSet.getString(5));
				 System.out.print(" Reports : "+resultSet.getString(6));
			 }
			
			 connection.close();
			}
			catch(ClassNotFoundException o)
			 {
			 System.out.println("Exception Handeled....");
			 }
		}
//#####################################################  WANTED LIST ####################################################################### 
	void wantedListInsert() throws SQLException {
		String AccusedName;
		int CaseID;
		System.out.println("Enter the CaseId : ");
		CaseID =details.nextInt();
		System.out.println("Enter the Accused Name : ");
		AccusedName =details.nextLine();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
			 String querry="insert into  WantedList values(?,?);";
			 PreparedStatement pst=connection.prepareStatement(querry);
			 pst.setInt(1, CaseID);
			 pst.setString(2,AccusedName);
			 System.out.println("Added Successfully..... ");
			 pst.executeUpdate();
			 connection.close();
			}
			catch(ClassNotFoundException o)
			 {
			 System.out.println("Exception Handeled....");
			 }		
	}
	public void WantedListDelete() throws SQLException {
		int CaseId;
		System.out.print("Enter Which Criminal wants delete ?..Officer Id ?...");
		CaseId=details.nextInt();
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 String querry="DELETE from WantedList where WantedList.CaseId=?;";
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","1234abc");
			 PreparedStatement pst=connection.prepareStatement(querry);
			 pst.setInt(1, CaseId);
			 System.out.println(".............................................................Deleted Successfully................................................................ ");
			 connection.close();
			}
			catch(ClassNotFoundException o)
			 {
			 System.out.println("Exception Handeled....");
			 }
		}
	
}