package com.spring.restapi.service;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.spring.restapi.entity.Employee;
import com.spring.restapi.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(String name, String address, int pincode,Long mobileNumber,MultipartFile file)throws IOException{
		Employee employee=new Employee();
		employee.setName(name);
		employee.setAddress(address);
		employee.setPincode(pincode);
		employee.setMobilenumber(mobileNumber);
		employee.setPdfDocument(file.getBytes());
		return employeeRepository.save(employee);
	}

}
