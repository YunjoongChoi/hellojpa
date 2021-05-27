package com.tutorial.hellojpa.employee.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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
    @JsonManagedReference
    private CompanyDto company;
    private String genderType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyMMdd", timezone = "Asia/Seoul")
    private LocalDate birthDate;
    private Date joinDate;
    private Date registDateTime;
    private Date updateDateTime;
    @JsonBackReference
    private Locker locker;
}
