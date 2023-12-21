package com.Aspire;

import java.sql.SQLException;

public interface Access {
	String DefaultName="Bharathan";
	String DefaultPassword="password";
	int officerID=0;
	 void login() throws SQLException;
}