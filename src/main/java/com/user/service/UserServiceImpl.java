package com.user.service;

import com.user.db.UserDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    Logger logger = (Logger) LogManager.getLogger(this.getClass());

    @Resource(name="userDAO")
    private UserDAO userDAO;

    @Transactional
    @Override
    public void Login(Map<String, Object> LoginForm) throws Exception {
        userDAO.DAOTest(LoginForm);
    }
}
