package com.tutorial.hellojpa.employee.dto;

import com.tutorial.hellojpa.common.enumerate.GenderType;
import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.employee.enumerate.EmployeePositionType;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long employeeIdx;
    private String employeeName;
    private CompanyDto companyDto;
    private String employeePositionType;
    private String genderType;
    private LocalDate birthDate;
    private Date joinDate;
    private Date registDateTime;
    private Date updateDateTime;
}
