package com.tutorial.hellojpa.company.entity;

import com.tutorial.hellojpa.common.enumerate.StatusCode;
import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.enumerate.CompanyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
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
    private String description;
    @Enumerated
    private CompanyType companyType;
    @Column
    private String tel;
    @Column
    private String address;
    @Column
    private Integer zipcode;
    @Column
    private String homepage;
    @Enumerated
    private StatusCode deleteAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date foundateDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;

    public CompanyDto toDto(){
        return CompanyDto.builder()
                .companyIdx(this.companyIdx)
                .companyName(this.companyName)
                .description(this.description)
                //.companyType(this.companyType)
                .tel(this.tel)
                .address(this.address)
                .zipcode(this.zipcode)
                .homepage(this.homepage)
                //.deleteAt(this.deleteAt)
                .foundateDateTime(this.foundateDateTime)
                .registDateTime(this.registDateTime)
                .updateDateTime(this.updateDateTime)
                .build();
    }
}
