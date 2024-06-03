package com.spring.restapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.restapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
