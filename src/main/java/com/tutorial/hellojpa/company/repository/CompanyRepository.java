package com.tutorial.hellojpa.company.repository;

import com.tutorial.hellojpa.company.entity.Company;
import com.tutorial.hellojpa.company.enumerate.CompanyType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Page<Company> findByCompanyNameContaining(String companyName, Pageable pageable);
    Page<Company> findByCompanyTypeEquals(String companyType, Pageable pageable);
    Page<Company> findByDeleteAtEquals(Boolean deleteAt, Pageable pageable);
    Page<Company> findByCompanyNameContainingOrCompanyTypeEqualsAndDeleteAtEquals(String companyName, CompanyType companyType, Boolean deleteAt, Pageable pageable);
}
