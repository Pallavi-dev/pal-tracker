package tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tracker.model.Employee;
import tracker.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeservice;
    @GetMapping("/employee")
    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = employeeservice.getEmployeeList();
        return employeeList;
    }
}
