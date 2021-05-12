package com.tutorial.hellojpa.employee.service;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Log
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> getList(EmployeeDto param, Pageable pageable, Sort sort) {
        List<EmployeeDto> resultList = new ArrayList<>();

        List<Employee> employeeList = employeeRepository.findAll();
        for(Employee employee : employeeList){
            resultList.add(employee.toDto());
        }

        return resultList;
    }

    @Override
    public EmployeeDto getEmployee(Long employeeIdx) {
        return employeeRepository.findById(employeeIdx).get().toDto();
    }
}
