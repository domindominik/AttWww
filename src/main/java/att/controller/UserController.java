package att.controller;

import att.dto.UserDto;
import att.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController
{
    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices)
    {
        this.userServices = userServices;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUserWiev(Model model)
    {
        model.addAttribute("userDto", new UserDto());
        return "register.jsp";
    }

    @PostMapping
    public String addUser(@Valid @ModelAttribute("userData") UserDto userDto, Model model)
    {
        this.userServices.createUser(userDto);
        return "login.jsp";
    }
}
