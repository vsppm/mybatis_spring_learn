package com.mclean.service;

import com.mclean.bean.UserBean;
import com.mclean.dao.IUserMapper;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/3/9 0009.
 */
@Service
public class UserService {

    private final IUserMapper userMapper;

    public UserService(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    UserBean selectUser(Integer id){
        return userMapper.selectUser(id);
    }
}
