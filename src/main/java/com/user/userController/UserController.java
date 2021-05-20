package com.user.userController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());

    @RequestMapping(value="/login.do")
    public void login_submit(@RequestParam Map<String, Object> Login_form) {
        logger.debug(("---------TEST---------"));
        logger.debug(Login_form);
        logger.debug(Login_form.get("email"));
    }
}
