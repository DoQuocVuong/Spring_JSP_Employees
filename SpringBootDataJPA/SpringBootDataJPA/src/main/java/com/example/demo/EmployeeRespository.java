package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {

    List<Employee> findByNameContaining(String q);

}