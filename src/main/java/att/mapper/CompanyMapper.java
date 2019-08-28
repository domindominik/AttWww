package att.mapper;

import att.db.Company;
import att.dto.CompanyDto;

public class CompanyMapper
{
    public static Company toEntity(CompanyDto companyDto)
    {
        Company company = new Company();
        company.setName(companyDto.g);
        return company;
    }
}
