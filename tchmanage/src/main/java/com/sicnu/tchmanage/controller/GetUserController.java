package com.sicnu.tchmanage.controller;

import com.sicnu.tchmanage.bean.UsersBean;
import com.sicnu.tchmanage.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class GetUserController {
    @Autowired
    UsersService usersService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/getUsers",method = RequestMethod.POST)
    public Map<String, ArrayList> getUsers(HttpServletRequest request){
        String status = request.getParameter("status");
        Map<String,ArrayList> map = new HashMap(16);
        ArrayList<UsersBean> list = usersService.getUsers(status);
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();


        for(int i =0;i < list.size();i++) {
            list2.add(list.get(i).getAccount()) ;
        }
        for(int i =0;i < list.size();i++) {
            list3.add(list.get(i).getUser_name()) ;
        }
        for(int i =0;i < list.size();i++) {
            list4.add(list.get(i).getUid());
        }
        map.put("user_account",list2);
        map.put("user_name",list3);
        map.put("user_id",list4);
        return map;
    }
}
