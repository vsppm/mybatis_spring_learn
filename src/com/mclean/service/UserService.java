package com.mclean.service;

import com.mclean.bean.UserBean;
import com.mclean.dao.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2019/3/9 0009.
 */
public class UserService {
    @Autowired
    private IUserMapper mapper;

    UserBean selectUser(Integer id){
        return mapper.selectUser(id);
    }
}
