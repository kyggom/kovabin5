package com.okdevtv.mvc;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import okjsp.User;
import okjsp.UserDAO;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register.do", method = RequestMethod.GET)
    public String register(Locale locale, Model model) {
        return "register";
    }

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String registerFinished(Locale locale, 
            @ModelAttribute("user") User user, Model model) {
        // check password and confirmPssword
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            // throws = go to errorpage
            model.addAttribute("msg", "password not matched!");
            model.addAttribute("user", user);
            return "register";
        }
        // id duplication
        // save()
        UserDAO.save(user);
        // to finish page
        //response.sendRedirect("registerFinished.jsp"); // Request Method get
        // request.getRequestDispatcher("register.jsp").forward(request, response);
        // //Request Method Post
        return "redirect:/registerFinished.do";
    }
    
    @RequestMapping(value = "/registerFinished.do")
    public String registerFinished(Model model) {
        return "registerFinished";
    }
}
