package domain.dao;

import java.sql.SQLException;

import domain.Employee;

public class EmployeeDao {
	// DAO - Data Access Object
	// Used for data storage, data retrieval and data deletion.
	
	public void saveEmployee(Employee emp) throws SQLException {
		//This is not needed.
//		DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//		connectionManager.connect();
//		connectionManager.getConnectionObject().prepareStatement("insert into emp_tbl");
//		connectionManager.disconnect();
		System.out.println("Saved employee to the database: Employee" + emp.toString());
	}
	
	public void deleteEmployee(Employee emp) throws SQLException {
		System.out.println("Deleted employee from the database");
	}

}
