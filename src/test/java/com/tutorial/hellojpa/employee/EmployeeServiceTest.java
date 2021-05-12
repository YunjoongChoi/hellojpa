package com.tutorial.hellojpa.employee;

import com.tutorial.hellojpa.employee.repository.EmployeeRepository;
import com.tutorial.hellojpa.employee.service.EmployeeService;
import com.tutorial.hellojpa.employee.service.EmployeeServiceImpl;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceTest {
    @Mock
    EmployeeRepository employeeRepository;
    @InjectMocks
    EmployeeServiceImpl employeeService;
}
