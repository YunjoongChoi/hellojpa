package com.tutorial.hellojpa.company.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.enumerate.CompanyType;
import com.tutorial.hellojpa.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyIdx;
    @Column
    private String companyName;
    @Lob
    private String descript;
    @Enumerated(EnumType.STRING)
    private CompanyType companyType;
    @Column
    private String tel;
    @Column
    private String address;
    @Column
    private Integer zipcode;
    @Column
    private String homepage;
    @OneToMany(mappedBy = "company")
    @JsonManagedReference
    private List<Employee> employeeList;
    @Column
    private Boolean deleteAt;
    @Column
    private LocalDateTime foundateDateTime;
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
}
