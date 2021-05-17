package com.tutorial.hellojpa.company.dto;

import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private Long companyIdx;
    private String companyName;
    private String descript;
    private String companyType;
    private String tel;
    private String address;
    private Integer zipcode;
    private String homepage;
    private List<EmployeeDto> employeeDtoList;
    private Boolean deleteAt;
    private LocalDateTime foundateDateTime;
    private Date registDateTime;
    private Date updateDateTime;
}
