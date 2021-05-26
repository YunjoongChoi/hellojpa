package com.tutorial.hellojpa.company.service;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyService {
    List<CompanyDto> getAllCompanies();
    CompanyDto getCompany(CompanyDto param);
    List<CompanyDto> getCompanies(Pageable pageable);
    List<CompanyDto> searchCompanies(CompanyDto param, Pageable pageable);
    List<CompanyDto> searchCompaniesDynamically(CompanyDto param, Pageable pageable);
}
