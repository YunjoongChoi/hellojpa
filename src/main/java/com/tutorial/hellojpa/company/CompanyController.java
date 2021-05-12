package com.tutorial.hellojpa.company;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
@Log
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping({"", "/", "/list"})
    public List<CompanyDto> getList(final CompanyDto param, final Pageable pageable, final Sort sort){
        return companyService.getList(param, pageable, sort);
    }

    @GetMapping({"/{companyIdx}"})
    public CompanyDto getCompany(@PathVariable Long companyIdx){
        return companyService.getCompany(companyIdx);
    }
}
