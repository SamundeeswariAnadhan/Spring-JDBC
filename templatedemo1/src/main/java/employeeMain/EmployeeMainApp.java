package employeeMain;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import employeeDaoImpPac.EmployeeJDBCTemplate;
import employeepac.Employee;

public class EmployeeMainApp {

	public static void main(String[] args) {
	
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate)
	         context.getBean("EmployeeJDBCTemplate");
	      
	      System.out.println("------Records Creation--------" );
	      employeeJDBCTemplate.create("samu", 1000);
	      employeeJDBCTemplate.create("priya", 2000);
	      employeeJDBCTemplate.create("Ayan", 1500);

	      System.out.println("------Listing Multiple Records--------" );
	      List<Employee> employees = employeeJDBCTemplate.listEmployees();
	      
	      for (Employee record : employees) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", salary : " + record.getSalary());
	      }  
	}

}
