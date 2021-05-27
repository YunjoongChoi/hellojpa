package com.tutorial.hellojpa.company.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tutorial.hellojpa.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    @Column
    private String tel;
    @Column
    private String address;
    @Column
    private Integer zipcode;
    @Column
    private String homepage;
    @JsonBackReference
    @OneToMany(mappedBy = "company")
    private List<Employee> employees;
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
