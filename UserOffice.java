package com.Aspire;

import java.sql.SQLException;

public abstract class UserOffice {
	abstract void registration() throws SQLException;
    abstract void wantedList()throws SQLException;
    abstract void CaseDetails() throws SQLException;
    abstract void Accused() throws SQLException;
    abstract void OfficerCode() throws SQLException;
}
