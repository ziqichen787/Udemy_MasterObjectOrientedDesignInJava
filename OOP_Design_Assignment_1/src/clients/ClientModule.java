package clients;

import java.sql.SQLException;

import domain.Employee;
import domain.dao.EmployeeDao;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
	
	public static void main(String args[]) {
		Employee peggyEmployee = new Employee(1, "Peggy", "Accounting", true);
		ClientModule.hireNewEmployee(peggyEmployee);
		printEmployeeReport(peggyEmployee);
	}
	
	
	public static void hireNewEmployee(Employee emp) {
		EmployeeDao employeeDao = new EmployeeDao();
		try {
			employeeDao.saveEmployee(emp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void terminiateEmployee(Employee emp) throws SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.deleteEmployee(emp);
		
	}
	
	public static void printEmployeeReport(Employee emp) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, FormatType.CSV);
		System.out.println(formatter.getFormattedEmployee());
		}
}
