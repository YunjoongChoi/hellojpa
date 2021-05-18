package com.tutorial.hellojpa.employee.service;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees(EmployeeDto param);
    EmployeeDto getEmployee(EmployeeDto param);
}
