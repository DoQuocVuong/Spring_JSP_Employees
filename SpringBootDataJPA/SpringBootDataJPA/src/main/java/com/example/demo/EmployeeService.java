package com.example.demo;

import java.util.List;
import com.example.demo.Employee;

public interface EmployeeService {
	Iterable<Employee> findAll();

    List<Employee> search(String q);

    Employee findOne(long id);

    void save(Employee emp);

    void delete(Employee emp);
}