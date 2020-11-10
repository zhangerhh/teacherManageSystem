package com.sicnu.tchmanage.service;

import com.sicnu.tchmanage.bean.UsersBean;


public interface UsersService {

    UsersBean loginIn(String account, String pswd);

    int change(String account,String uid,String pswd);
}
