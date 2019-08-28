package att.services;

import att.db.Company;
import att.dto.CompanyDto;
import att.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static att.mapper.CompanyMapper.toEntity;

@Service
public class CompanyServices
{
    private CompanyRepository companyRepository;

    @Autowired
    public CompanyServices(CompanyRepository companyRepository)
    {
        this.companyRepository = companyRepository;
    }

    public void createCompany(CompanyDto companyDto)
    {
        Company company = toEntity(companyDto);
        this.companyRepository.save(company);
    }
}
