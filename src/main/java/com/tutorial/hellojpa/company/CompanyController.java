package com.tutorial.hellojpa.company;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
@Log
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping({"/list"})
    public List<CompanyDto> getList(final CompanyDto param, final Pageable pageable, final Sort sort){
        return null;
    }

    @GetMapping({"/{companyIdx"})
    public CompanyDto getCompany(final CompanyDto param){
        return null;
    }
}
