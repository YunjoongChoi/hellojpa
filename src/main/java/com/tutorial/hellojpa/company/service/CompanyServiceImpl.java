package com.tutorial.hellojpa.company.service;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.company.mapper.CompanyMapper;
import com.tutorial.hellojpa.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<CompanyDto> companyDtos = new ArrayList<>();
        List<Company> companies = companyRepository.findAll();
        for(Company company : companies){
            companyDtos.add(modelMapper.map(company, CompanyDto.class));
        }

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
        List<CompanyDto> companyDtoList = new ArrayList<>();
        Page<Company> companyList = companyRepository.findAll(pageable);
        for(Company company : companyList){
            companyDtoList.add(modelMapper.map(company, CompanyDto.class));
        }
        return companyDtoList;

        /*return companyRepository.findAll(pageable)
                                .stream()
                                .map(Company -> modelMapper.map(Company, CompanyDto.class))
                                .collect(Collectors.toList());*/

        /*return companyMapper.toDto(companyRepository.findAll(pageable));*/
    }

    @Override
    public List<CompanyDto> searchCompanies(CompanyDto param, Pageable pageable) {
        return companyRepository.findByCompanyTypeEquals(param.getCompanyType(), pageable)
                                .stream()
                                .map(Company -> modelMapper.map(Company, CompanyDto.class))
                                .collect(Collectors.toList());
    }

    @Override
    public List<CompanyDto> searchCompaniesDynamically(CompanyDto param, Pageable pageable) {
        return null;
    }
}
