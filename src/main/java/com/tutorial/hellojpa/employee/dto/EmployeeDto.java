package com.tutorial.hellojpa.employee.dto;

import com.tutorial.hellojpa.common.enumerate.GenderType;
import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.employee.entity.Employee;
import com.tutorial.hellojpa.employee.enumerate.EmployeePositionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Builder
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

    public Employee toEntity(){
        return Employee.builder()
                .employeeIdx(this.employeeIdx)
                .employeeName(this.employeeName)
                .company(this.companyDto.toEntity())
                //.employeePositionType(this.employeePositionType)
                //.genderType(this.genderType)
                .birthDate(this.birthDate)
                .joinDate(this.joinDate)
                .registDateTime(this.registDateTime)
                .updateDateTime(this.updateDateTime)
                .build();
    }
}
