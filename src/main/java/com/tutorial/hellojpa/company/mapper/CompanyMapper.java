package com.tutorial.hellojpa.company.mapper;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface CompanyMapper {

    CompanyDto toDto(Company company);
    List<CompanyDto> toDto(List<Company> company);
    List<CompanyDto> toDto(Page<Company> company);

    Company toEntity(CompanyDto companyDto);
    List<CompanyDto> toEntity(List<Company> companies);
}
