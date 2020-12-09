package ru.springcourse.lessons.thymeleafdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.springcourse.lessons.thymeleafdemo.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByOrderByLastNameAsc();
}
