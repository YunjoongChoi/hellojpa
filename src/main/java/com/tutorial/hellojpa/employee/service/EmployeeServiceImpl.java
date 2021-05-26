package com.tutorial.hellojpa.employee.service;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Log
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(Employee -> modelMapper.map(Employee, EmployeeDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getEmployee(EmployeeDto param) {
        return modelMapper.map(employeeRepository.findById(param.getEmployeeIdx())
                                                                .orElse(Employee.builder()
                                                                                .build()), EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable)
                                    .stream()
                                    .map(Employee -> modelMapper.map(Employee, EmployeeDto.class))
                                    .collect(Collectors.toList());
    }
}
