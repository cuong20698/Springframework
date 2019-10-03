package org.o7planning.hellospringmvc.controller;

import javax.xml.ws.Response;

import org.omg.CORBA.Request;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/a", method = RequestMethod.GET)
    public String hello(Model model) {
		ModelAndView mv = new ModelAndView();
        return "helloworld"; 
    }
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String cuong(Model model) {
		ModelAndView mv = new ModelAndView();
		
		String user = "aaaaaaaaaaaaa";
        model.addAttribute("greeting", "Hello Spring MVC");
        model.addAttribute("ok", user);
        
        return "helloworld"; 
    }

}
