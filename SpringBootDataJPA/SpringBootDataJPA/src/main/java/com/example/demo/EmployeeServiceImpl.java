package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employee;
import com.example.demo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> search(String q) {
        return employeeRepository.findByNameContaining(q);
    }

    @Override
    public Employee findOne(long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public void save(Employee emp) {
    	employeeRepository.save(emp);
    }

    @Override
    public void delete(Employee emp) {
    	employeeRepository.delete(emp);
    }
}