package com.somnath.demo.DAO;

import com.somnath.demo.enity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //that's it .. no need to write any code LOL!

}
