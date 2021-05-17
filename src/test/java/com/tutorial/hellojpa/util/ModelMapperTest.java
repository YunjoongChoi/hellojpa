package com.tutorial.hellojpa.util;

import com.tutorial.hellojpa.company.dto.CompanyDto;
import com.tutorial.hellojpa.company.entity.Company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ModelMapperTest {
    @InjectMocks
    private ModelMapper modelMapper;

    @Test
    public void 모델_매퍼_테스트(){
        /*given*/
        Company company = Company.builder()
                                    .companyIdx(100L)
                                    .build();

        /*when*/
        CompanyDto companyDto = modelMapper.map(company, CompanyDto.class);


        /*then*/
        Assertions.assertEquals(companyDto.getCompanyIdx(), company.getCompanyIdx());
    }
}
