package com.tutorial.hellojpa.company.service;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.company.mapper.CompanyMapper;
import com.tutorial.hellojpa.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Log
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository companyRepository;
    private final ModelMapper modelMapper;
    private final CompanyMapper companyMapper;

    @Override
    public List<CompanyDto> getAllCompanies() {
        return companyRepository.findAll()
                                .stream()
                                .map(Company -> modelMapper.map(Company, CompanyDto.class))
                                .collect(Collectors.toList());
    }

    @Override
    public CompanyDto getCompany(CompanyDto param) {
        return modelMapper.map(companyRepository.findById(param.getCompanyIdx())
                                                .orElse(Company.builder()
                                                                .build()), CompanyDto.class);
    }

    @Override
    public List<CompanyDto> getCompanies(Pageable pageable) {
        return companyRepository.findAll(pageable)
                                .stream()
                                .map(Company -> modelMapper.map(Company, CompanyDto.class))
                                .collect(Collectors.toList());
    }

    @Override
    public List<CompanyDto> searchCompanies(CompanyDto param, Pageable pageable) {
        return companyRepository.findByCompanyNameContaining(param.getCompanyName(), pageable)
                                .stream()
                                .map(Company -> modelMapper.map(Company, CompanyDto.class))
                                .collect(Collectors.toList());
    }
}
