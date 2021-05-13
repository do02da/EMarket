package com.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());


    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public String signup(){

        logger.debug("hi");
        return "home";
    } // signup

}
