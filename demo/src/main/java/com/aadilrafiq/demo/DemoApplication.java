package com.aadilrafiq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.aadilrafiq.demo")
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private EmployeeDao employeeDao;

		void addEmployeeTest(){
			Employee employee = new Employee();
			employee.setName("my centos");
			employee.setlanguage("java");
			employee.setName("django");
			employeeDao().save(employee);
		}
	@Test
	void getAllEmployeesAndDeleteThem(){
		List<Employee> employee = employeeDao.getAllEmployees();
		for(Employee employee : employees){
			employeeDao.delete(employee);
		}
		System.out.println(employees);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
