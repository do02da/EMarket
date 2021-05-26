package com.user.controller;

import javax.annotation.Resource;

import com.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());

    @Resource(name="userService")
    UserService userService;

    @RequestMapping(value = "/register.do")
    public ModelAndView register(@RequestParam Map<String, Object> regForm) {
//        ModelAndView
        logger.debug(regForm);


        return null;
    } // register


    /**
     * 로그인
     * @author   김도영
     * @param    LoginForm 로그인 폼에 입력한 정보
     * @return
     */
    @RequestMapping(value="/login.do")
    public void login_submit(@RequestParam Map<String, Object> LoginForm) throws Exception {
        logger.debug(LoginForm);

        userService.Login(LoginForm);
    }
} // class
