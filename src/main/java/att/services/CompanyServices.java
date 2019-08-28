package att.services;

import att.db.Company;
import att.dto.CompanyDto;
import att.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional
    public List<Company> findAll()
    {
        return this.companyRepository.findAll();
    }

    @Transactional
    public Company getCompanyById(int id)
    {
        return this.companyRepository.findById(id).get();
    }
}
