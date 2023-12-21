package com.Aspire;

import java.sql.SQLException;
import java.util.Scanner;

public class Authendication implements Access {
public void login() throws SQLException {
	String name;
	String password;
	try (Scanner scanner = new Scanner(System.in)) {
		CaseData casedata = new CaseData();
			System.out.println("Enter your Name : ");
					name=scanner.nextLine();
			System.out.println("Enter your password:");
					password=scanner.nextLine();
					if(name.equals(DefaultName) && password.equals(DefaultPassword)) {
						System.out.println("Enter the option  1.Add 2.Remove.3.View 4.Exit");
						int num=scanner.nextInt();
						switch(num){
							case 1:
								casedata.OfficerCode();
								break;
							case 2:
								casedata.OfficerDelete();
								break;   
							case 3:
								casedata.OfficerView();
								break;
							case 4:
								System.exit(0);
							default:
								System.out.println("None of option");
								break;	
						}
			
				}
					else{	System.out.println("Your Password and User name is incorrect");					}
	}
	}
}

	
