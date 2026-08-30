package com.eazybytes.jobportal.service;

import com.eazybytes.jobportal.dto.CompanyDto;
import com.eazybytes.jobportal.entity.Company;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> getAllCompanies();
    boolean createCompany(CompanyDto companyDto);
    List<CompanyDto>  getAllCompaniesForAdmin();
    void deleteCompanyById(Long id);
    boolean updateCompanyDetails(Long id, CompanyDto companyDto);
}
