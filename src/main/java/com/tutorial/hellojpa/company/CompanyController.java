package com.tutorial.hellojpa.company;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/company")
@Log
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping({ "/all"})
    public List<CompanyDto> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @GetMapping({"/{companyIdx}"})
    public CompanyDto getCompany(@PathVariable final Long companyIdx){
        return companyService.getCompany(CompanyDto.builder()
                                                        .companyIdx(companyIdx)
                                                    .build());
    }

    @GetMapping({"", "/"})
    public List<CompanyDto> getCompanies(final Pageable pageable){
        return companyService.getCompanies(pageable);
    }

    @GetMapping({"/keyword"})
    public List<CompanyDto> searchByKeyword(final CompanyDto param, final Pageable pageable){
        return companyService.searchCompanies(param, pageable);
    }
}
