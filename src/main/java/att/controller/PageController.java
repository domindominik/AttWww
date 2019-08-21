package att.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/menu")
public class PageController
{
    @RequestMapping("/menu")
    public String home()
    {
        return "index";
    }
}
