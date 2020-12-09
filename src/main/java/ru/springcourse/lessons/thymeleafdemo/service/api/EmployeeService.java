package ru.springcourse.lessons.thymeleafdemo.service.api;

import ru.springcourse.lessons.thymeleafdemo.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
