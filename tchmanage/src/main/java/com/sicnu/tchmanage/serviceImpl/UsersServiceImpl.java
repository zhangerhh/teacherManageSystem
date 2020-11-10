package com.sicnu.tchmanage.serviceImpl;

import com.sicnu.tchmanage.bean.UsersBean;
import com.sicnu.tchmanage.dao.UsersDao;
import com.sicnu.tchmanage.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    @Override
    public UsersBean loginIn(String account, String pswd){
        return usersDao.getInfo(account,pswd);
    }

    @Override
    public  int change(String account,String uid,String pswd){
        return usersDao.postInfo(account,uid,pswd);
    }
}

