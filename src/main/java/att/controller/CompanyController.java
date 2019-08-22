package att.controller;

import att.dto.CompanyDto;
import att.dto.UserDto;
import att.services.CompanyServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CompanyController
{
    private CompanyServices companyServices;

    public CompanyController(CompanyServices companyServices)
    {
        this.companyServices = companyServices;
    }

    @RequestMapping(value = "/addCompany", method = RequestMethod.GET)
    public String addCompanyView(Model model)
    {
        model.addAttribute("companyDto", new UserDto());
        return "addcompany";
    }

    @PostMapping(value = "/addCompany")
    public String addUser(@Valid @ModelAttribute("userData") CompanyDto companyDto, Model model)
    {
        this.companyServices.createUser(companyDto);
        return "addcompany";
    }
}
