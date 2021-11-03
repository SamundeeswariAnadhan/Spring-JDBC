package employeeDaoImpPac;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import employeeDaopac.EmployeeDAO;
import employeepac.Employee;

public class EmployeeJDBCTemplate implements EmployeeDAO{
	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   public void setDataSource(DataSource dataSource) {
		      this.dataSource = dataSource;
		      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
		      public void create(String name, int salary) {
		          String SQL = "insert into employee_table(employeename,salary) values (?, ?)";
		          
		          jdbcTemplateObject.update( SQL, name, salary);
		          System.out.println("Created Record Name = " + name + " Salary = " + salary);
		          return;
		       }
		       public List<Employee> listEmployees() {
		          String SQL = "select * from employee_table";
		          List <Employee> employees = jdbcTemplateObject.query(SQL, new EmployeeMapper());
		          return employees;   
	   }
			public Employee getEmployee(int id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			}
		       
		       
			
	

