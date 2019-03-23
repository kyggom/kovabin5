package com.okdevtv.mvc;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import okjsp.Salary;

@Controller
public class SalaryController {

    @RequestMapping(value = "/salaryregister.do", method = RequestMethod.GET)
    public String register(Locale locale, Model model) {
        return "register";
    }

    @RequestMapping(value = "/salaryregister.do", method = RequestMethod.POST)
    public String registerFinished(Locale locale, 
            @ModelAttribute("sal") Salary sal, Model model, HttpServletRequest httpServletRequest) {
        // check password and confirmPssword
        //Salary sal = new Salary();
//        request.setCharacterEncoding("euc-kr");
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
        sal.setGnum(httpServletRequest.getParameter("gnum"));
        sal.setYear(httpServletRequest.getParameter("year"));
        sal.setMonth(httpServletRequest.getParameter("month"));
        if (!sal.getGnum().equals("0600001")) {
            // throws = go to errorpage
            model.addAttribute("msg", "password not matched!");
//            model.addAttribute("user", user);
            return "salaryregister";
        }
        // id duplication
        // save()
//        SalaryDAO.save(sal);
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
