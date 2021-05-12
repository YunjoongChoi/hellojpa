package com.tutorial.hellojpa.company.dto;

import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.employee.dto.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Builder
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

    public Company toEntity(){
        return Company.builder()
                .companyIdx(this.companyIdx)
                .companyName(this.companyName)
                .descript(this.descript)
                //.companyType(this.companyType)
                .tel(this.tel)
                .address(this.address)
                .zipcode(this.zipcode)
                .homepage(this.homepage)
                .deleteAt(this.deleteAt)
                .foundateDateTime(this.foundateDateTime)
                .registDateTime(this.registDateTime)
                .updateDateTime(this.updateDateTime)
                .build();
    }
}
