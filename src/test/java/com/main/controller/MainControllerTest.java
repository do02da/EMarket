package com.main.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

public class MainControllerTest {

    @Test
    public void testMethod() throws Exception {
        MainController main = new MainController();
        ModelAndView mv = new ModelAndView("gogo");
        int a = 5+4;
        assertEquals(new ModelAndView("gogo").getViewName(), mv.getViewName());
        assertEquals(5+5-1, a);

    } //

}
