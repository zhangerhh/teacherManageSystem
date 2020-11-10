package com.sicnu.tchmanage.controller;

import com.sicnu.tchmanage.bean.UsersBean;
import com.sicnu.tchmanage.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChangeController {
    @Autowired
    UsersService usersService;

    @RequestMapping("/change")
    public String show(){
        return "change";
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)
    public String change(String name,String uid,String password){
        int status = usersService.change(name,uid,password);
        if(status == 1){
            return "success";
        }
        else {
            return "error";
        }
    }
}
