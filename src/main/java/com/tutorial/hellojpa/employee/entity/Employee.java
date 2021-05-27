package com.tutorial.hellojpa.employee.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tutorial.hellojpa.common.enumerate.GenderType;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.locker.entity.Locker;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeIdx;
    @Column(nullable = false)
    private String employeeName;
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_IDX")
    private Company company;
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
    @JsonBackReference
    @OneToOne(mappedBy = "employee")
    private Locker locker;
}
