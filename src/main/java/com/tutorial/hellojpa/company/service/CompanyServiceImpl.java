package com.tutorial.hellojpa.company.service;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Log
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository companyRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CompanyDto> getList(CompanyDto param, Pageable pageable) {
        return Company.toDtoList(companyRepository.findAll());
    }

    @Override
    public CompanyDto getCompany(CompanyDto param) {
        return modelMapper.map(companyRepository.findById(param.getCompanyIdx())
                                                                .orElse(Company.builder()
                                                                                .build()), CompanyDto.class);
    }
}
