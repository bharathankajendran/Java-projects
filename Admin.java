package com.Aspire;
import java.sql.SQLException;
import java.util.Scanner;
public class Admin {
	Authendication Auth=new Authendication();	
	CaseData casedata = new CaseData();
	public void Adminlogin() throws SQLException{
			Auth.login();
			}
		public void officer() throws SQLException{
			System.out.println(" 1.Register Complaint \n 2.CaseDetails \n 3.Wanted List \n 4.Accussed Details \n 5Exit");
			int officerId;
			try (Scanner scanner = new Scanner(System.in)) {
				officerId=scanner.nextInt();
			}
			switch(officerId) {
			case 1:
			casedata.registration();
				break;
			case 2:
			casedata.CaseDetails();
				break;
			case 3:
					int officerId1;
					System.out.println("1. Add Wanted List 2.Remove the Wanted List 3.View ");
					Scanner scanner = new Scanner(System.in);
						officerId1=scanner.nextInt();
					switch(officerId1) {
					case 1:
					casedata.wantedList();
						break;
					case 2:
					casedata.WantedListDelete();
					default:
						System.out.println("None Of option ");
						}
					
				break;
			case 4:
			casedata.Accused();
				break;
			case 5:
				break;
			default:
				System.out.println("None of option.... please check the option....");

			}
	}
		
}


