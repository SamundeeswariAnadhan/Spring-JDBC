package employeeDaoImpPac;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import employeepac.Employee;

public class EmployeeMapper implements RowMapper<Employee>
{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
       
		Employee employee =new Employee();
		
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("employeename"));
		employee.setSalary(rs.getInt("salary"));
		
		return employee;
	}
	
	

}
