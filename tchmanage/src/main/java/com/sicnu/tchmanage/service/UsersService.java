package com.sicnu.tchmanage.service;

import com.sicnu.tchmanage.bean.UsersBean;

import java.util.ArrayList;


public interface UsersService {

    UsersBean loginIn(String account, String pswd);

    int change(String account,String uid,String pswd);
    ArrayList<UsersBean> getUsers(String status);
}
