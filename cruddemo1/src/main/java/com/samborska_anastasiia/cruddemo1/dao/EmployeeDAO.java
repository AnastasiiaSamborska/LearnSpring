package com.samborska_anastasiia.cruddemo1.dao;
import com.samborska_anastasiia.cruddemo1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
