package com.tutorial.hellojpa.employee.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.locker.entity.Locker;
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
    private CompanyDto company;
    private String employeePositionType;
    private String genderType;
    private LocalDate birthDate;
    private Date joinDate;
    private Date registDateTime;
    private Date updateDateTime;
    private Locker locker;
}
