package ru.springcourse.lessons.thymeleafdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.springcourse.lessons.thymeleafdemo.entities.Employee;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final List<Employee> employees = new ArrayList<>();

    @PostConstruct
    public void loadData() {
        employees.add(new Employee(1, "John", "Doe", "doe@gmail.com"));
        employees.add(new Employee(2, "Hannah", "Lee", "lee@gmail.com"));
        employees.add(new Employee(3, "Mary", "Bergman", "bergman@gmail.com"));
    }

    @GetMapping("/list")
    public String getEmployees(Model model){
        model.addAttribute("employees", employees);
        return "list-employees";
    }
}
