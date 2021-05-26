package com.tutorial.hellojpa.employee.mapper;

import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.employee.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface EmployeeMapper {

    EmployeeDto toDto(Employee employee);
    List<EmployeeDto> toDto(List<Employee> employees);
    List<EmployeeDto> toDto(Page<Employee> employees);

    Employee toEntity(EmployeeDto employeeDto);
    List<Employee> toEntity(List<EmployeeDto> employees);
}
