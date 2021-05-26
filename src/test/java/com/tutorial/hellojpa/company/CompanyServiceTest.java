package com.tutorial.hellojpa.company;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.company.repository.CompanyRepository;
import com.tutorial.hellojpa.company.service.CompanyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.thymeleaf.util.StringUtils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CompanyServiceTest {
    @Mock
    private CompanyRepository companyRepository;
    @Mock
    private CompanyService companyService;

    @Test
    public void 전체_목록_조회_테스트(){
        /*given*/
        CompanyDto param = CompanyDto.builder().build();

        /*when*/
        List<CompanyDto> companyDtoList = companyService.getAllCompanies();

        /*then*/
        assertThat(companyDtoList.size() == 11);
    }

    @Test
    public void 상세_조회_테스트(){
        /*given*/
        CompanyDto param = CompanyDto.builder()
                                        .companyIdx(10L)
                                        .build();

        /*when*/
        CompanyDto companyDto = companyService.getCompany(param);

        /*then*/
        assertThat(StringUtils.equals("기업10", companyDto.getCompanyName()));
    }

    @Test
    public void 검색_조회_테스트(){
        /*given*/
        CompanyDto param1 = CompanyDto.builder().companyName("기업11").build();

        /*when*/
        Page<Company> result = companyRepository.findByCompanyNameContaining(param1.getCompanyName(), PageRequest.of(0,100));

        /*then*/
        Assertions.assertEquals(result.getSize(), 1);
    }
}
