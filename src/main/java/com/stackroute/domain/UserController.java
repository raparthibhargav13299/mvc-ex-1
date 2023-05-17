package com.stackroute.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {

    //Handler method which is used to handle all the requests ending with /
    @GetMapping
    public ModelAndView ModelAndView(){
        //Creating object for the user
//        User user = new User("coder");
        //Adding attribute to the view
//        modelMap.addAttribute("message",user.getMessage());
        //Returning view
        ModelAndView mv= new ModelAndView("index");
        mv.addObject("name","hello");
        return mv;
    }

}