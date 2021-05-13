package com.tutorial.hellojpa.company;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.repository.CompanyRepository;
import com.tutorial.hellojpa.company.service.CompanyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

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
        List<CompanyDto> companyDtoList = companyService.getList(param, null, null);

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
        assertThat("기업10".equals(companyDto.getCompanyName()));
    }
}
