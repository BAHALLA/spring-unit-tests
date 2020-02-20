package org.sid.config;

import org.sid.dao.EmployeeRepository;
import org.sid.entities.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class EmployFixture implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public EmployFixture(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("BAHALLA", "ALI", "MOHAMMED").forEach( n -> {
            employeeRepository.save(new Employee(null, n));
        });
    }
}
