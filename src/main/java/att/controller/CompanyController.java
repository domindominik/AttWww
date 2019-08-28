package att.controller;

import att.db.Company;
import att.dto.CompanyDto;
import att.dto.UserDto;
import att.services.CompanyServices;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CompanyController
{
    private CompanyServices companyServices;

    public CompanyController(CompanyServices companyServices)
    {
        this.companyServices = companyServices;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/company", method = RequestMethod.POST)
    public void addCompanyView(@RequestBody @Valid CompanyDto companyDto)
    {
        this.companyServices.createCompany(companyDto);
    }

    @RequestMapping(value = "/company", method = RequestMethod.GET)
    public List<Company> companyDtoList()
    {
        return companyServices.findAll();
    }
}
