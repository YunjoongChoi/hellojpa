package com.tutorial.hellojpa.employee.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tutorial.hellojpa.common.enumerate.GenderType;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import com.tutorial.hellojpa.employee.enumerate.EmployeePositionType;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeIdx;
    @Column(nullable = false)
    private String employeeName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_IDX")
    @JsonBackReference
    private Company company;
    @Enumerated(EnumType.STRING)
    private EmployeePositionType employeePositionType;
    @Enumerated(EnumType.STRING)
    private GenderType genderType;
    @Column
    private LocalDate birthDate;
    @Temporal(TemporalType.DATE)
    private Date joinDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
    @OneToOne(mappedBy = "employee")
    private Locker locker;

    public EmployeeDto toDto(){
        return EmployeeDto.builder()
                .employeeIdx(this.employeeIdx)
                .employeeName(this.employeeName)
                .companyDto(this.company.toDto())
                .employeePositionType(this.employeePositionType.getValue())
                .genderType(this.genderType.getValue())
                .birthDate(this.birthDate)
                .joinDate(this.joinDate)
                .registDateTime(this.registDateTime)
                .updateDateTime(this.updateDateTime)
                .build();
    }

    public static List<EmployeeDto> toDtoList(List<Employee> employeeList){
        List<EmployeeDto> resultList = new ArrayList<>();
        for(Employee employee : employeeList){
            resultList.add(employee.toDto());
        }
        return resultList;
    }
}
