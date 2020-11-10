package com.sicnu.tchmanage.controller;

import com.sicnu.tchmanage.bean.UsersBean;
import com.sicnu.tchmanage.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class LoginController {
    @Autowired
    UsersService usersService;


    @RequestMapping("/login")
    public String show(){
        return "login";
    }
    @RequestMapping("/loginb")
    public String showa(){
        return "loginb";
    }


//    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
//    public String login(String username,String password){
//        UsersBean usersBean = usersService.loginIn(username,password);
//        System.out.println(username);
//        if(usersBean !=null){
//            return "index";
//        }
//        else {
//            return "error";
//        }
//
//    }
        @ResponseBody
        @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
        public Map<String, Object> login(HttpServletRequest request){
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            UsersBean usersBean = usersService.loginIn(username,password);
            Map<String, Object> map = new HashMap(16);

            map.put("user_name",usersBean.getUser_name());
            map.put("role_name",usersBean.getRole_name());
            map.put("role_id",usersBean.getRole_id());
            System.out.println(map.get("user_name"));
            System.out.println(map.get("role_name"));
            System.out.println(map.get("role_id"));
            return map;

        }
}
