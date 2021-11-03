package employeeDaopac;

import java.util.List;

import javax.sql.DataSource;

import employeepac.Employee;

public interface EmployeeDAO {
	
	public  void setDataSource(DataSource ds);
	
	 public void create(String name, int salary);
	   public Employee getEmployee(int id);
	   
	   public List<Employee> listEmployees();
}
