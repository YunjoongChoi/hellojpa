package com.tutorial.hellojpa.company.service;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CompanyService {
    List<CompanyDto> getList(CompanyDto param, Pageable pageable);
    CompanyDto getCompany(CompanyDto param);
}
