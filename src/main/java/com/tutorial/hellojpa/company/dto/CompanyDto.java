package com.tutorial.hellojpa.company.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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
    private String tel;
    private String address;
    private Integer zipcode;
    private String homepage;
    @JsonBackReference
    private List<EmployeeDto> employees;
    private Boolean deleteAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime foundateDateTime;
    private Date registDateTime;
    private Date updateDateTime;
}
