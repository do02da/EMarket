package com.main.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());

    @RequestMapping(value="/pageMove.do")
    public ModelAndView pageMove(@RequestParam String go) throws Exception {
        ModelAndView mv = new ModelAndView(go);

        return mv;
    }

}
