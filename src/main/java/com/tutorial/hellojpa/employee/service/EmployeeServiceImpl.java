package com.tutorial.hellojpa.employee.service;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Log
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<EmployeeDto> getList(EmployeeDto param, Pageable pageable) {
        return Employee.toDtoList(employeeRepository.findAll());
    }

    @Override
    public EmployeeDto getEmployee(EmployeeDto param) {
        return modelMapper.map(employeeRepository.findById(param.getEmployeeIdx())
                                                                .orElse(Employee.builder()
                                                                                .build()), EmployeeDto.class);
    }
}
