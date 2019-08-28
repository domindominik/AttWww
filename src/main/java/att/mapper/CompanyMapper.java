package att.mapper;

import att.db.Company;
import att.dto.CompanyDto;

public class CompanyMapper
{
    public static Company toEntity(CompanyDto companyDto)
    {
        Company company = new Company();
        company.setName(companyDto.getName());
        company.setType(companyDto.getType());
        company.setStreet(companyDto.getStreet());
        company.setNumber(companyDto.getNumber());
        company.setApartment(companyDto.getApartment());
        company.setZipcode(companyDto.getZipcode());
        company.setStock(companyDto.getStock());
        company.setTicker(companyDto.getTicker());
        company.setAdd(companyDto.getAdd());
        return company;
    }

    public static CompanyDto companyDto(Company company)
    {
        CompanyDto companyDto = new CompanyDto();
        companyDto.setName(company.getName());
        companyDto.setType(company.getType());
        companyDto.setStreet(company.getStreet());
        companyDto.setApartment(company.getApartment());
        companyDto.setZipcode(company.getZipcode());
        companyDto.setStock(company.getStock());
        companyDto.setTicker(company.getTicker());
        companyDto.setAdd(company.getAdd());
        return companyDto;
    }
}
