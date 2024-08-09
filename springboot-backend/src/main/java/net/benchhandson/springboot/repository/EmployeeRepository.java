package net.benchhandson.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.benchhandson.springboot.model.Employee;

@Repository  

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
