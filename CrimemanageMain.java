package com.Aspire;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.*;
public class CrimemanageMain {
	public static void main(String[] args) throws SQLException{
		Authendication Auth=new Authendication();
		Admin admin=new Admin();
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Your posistion : 1.Admin  2.Officer ");
			int inputNumber;
			inputNumber=scanner.nextInt();
			switch(inputNumber)
			{
			case 1:
				Auth.login();
				break;
			case 2:
				admin.officer();
				break;
			default:
				System.out.println("None of option");
			}
		}
		}	
		


