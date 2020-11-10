package com.sicnu.tchmanage;

import com.sicnu.tchmanage.bean.UsersBean;
import com.sicnu.tchmanage.controller.LoginController;
import com.sicnu.tchmanage.service.UsersService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@SpringBootTest
@RunWith(SpringRunner.class)
class TchmanageApplicationTests {

    @Autowired
    UsersService usersService;

    @Test
    void contextLoads() {
//        UsersBean usersBean = usersService.loginIn("2018110462","123456");
//        System.out.println("该用户ID为");
//        System.out.println(usersBean.getUid());

//        int status = usersService.change("20181104","513029","123456");

        LoginController loginController = new LoginController();
//        loginController.login("20181104","123");


    }

}
