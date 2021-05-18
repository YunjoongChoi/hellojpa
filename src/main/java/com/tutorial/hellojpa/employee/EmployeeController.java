package com.tutorial.hellojpa.employee;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
@Log
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping({ "/all"})
    public List<EmployeeDto> getAllEmployees(final EmployeeDto param){
        return employeeService.getAllEmployees(param);
    }

    @GetMapping({"/{employeeIdx}"})
    public EmployeeDto getEmployee(@PathVariable final Long employeeIdx){
        return employeeService.getEmployee(EmployeeDto.builder()
                                                        .employeeIdx(employeeIdx)
                                                        .build());
    }

    @GetMapping({"", "/"})
    public List<EmployeeDto> getEmployees(final EmployeeDto param, final Pageable pageable){
        return employeeService.getEmployees(param, pageable);
    }
}
