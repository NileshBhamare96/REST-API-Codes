package in.nileshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public ModelAndView getWelcomeMsg() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "Welcome to NILESH IT...!!");
        mav.setViewName("index"); // This should match the name of your JSP file
        return mav;
    }
}
