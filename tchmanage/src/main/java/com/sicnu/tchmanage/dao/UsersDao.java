package com.sicnu.tchmanage.dao;

import com.sicnu.tchmanage.bean.UsersBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface UsersDao {
    UsersBean getInfo(String account, String pswd);

    int postInfo(String account,String uid,String pswd);


    ArrayList<UsersBean> getall(String status);
}
