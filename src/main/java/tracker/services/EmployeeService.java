package tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tracker.model.Employee;
import tracker.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }
}
