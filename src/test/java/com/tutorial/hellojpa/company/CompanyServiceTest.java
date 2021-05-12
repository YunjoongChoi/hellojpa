package com.tutorial.hellojpa.company;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.repository.CompanyRepository;
import com.tutorial.hellojpa.company.service.CompanyService;
import com.tutorial.hellojpa.company.service.CompanyServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CompanyServiceTest {
    @Mock
    private CompanyRepository companyRepository;
    @InjectMocks
    private CompanyServiceImpl companyService;

    @Test
    public void 전체_조회_테스트(){
        /*given*/

        /*when*/
        List<CompanyDto> companyDtoList = companyService.getList(CompanyDto.builder().build(), null, null);

        /*then*/
        assertThat(companyDtoList.size() == 11);
    }

    @Test
    public void 상세_조회_테스트(){
        /*given*/

        /*when*/
        CompanyDto companyDto = companyService.getCompany(10L);

        /*then*/
        assertThat("기업10".equals(companyDto.getCompanyName()));
    }
}
