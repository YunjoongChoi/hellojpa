package com.tutorial.hellojpa.company.service;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CompanyService {
    List<CompanyDto> getList(CompanyDto param, Pageable pageable, Sort sort);
    CompanyDto getCompany(Long companyIdx);
}
