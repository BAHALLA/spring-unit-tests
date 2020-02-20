package org.sid.controllers;

import org.sid.entities.Employee;
import org.sid.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@RestController
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public Map<String, String> index() {
        Map<String,String> list =new HashMap<>();
        Stream.of("a","b", "c","d").forEach( p -> {
            list.put(p, p + "_v");
        });
        return list;
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

}
