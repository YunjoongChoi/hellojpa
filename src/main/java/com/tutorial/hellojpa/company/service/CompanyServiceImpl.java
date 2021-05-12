package com.tutorial.hellojpa.company.service;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Log
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository companyRepository;

    @Override
    public List<CompanyDto> getList(CompanyDto param, Pageable pageable, Sort sort) {
        return null;
    }

    @Override
    public CompanyDto getCompany(CompanyDto param) {
        return null;
    }
}
