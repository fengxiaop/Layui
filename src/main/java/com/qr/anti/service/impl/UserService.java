package com.qr.anti.service.impl;

import com.qr.anti.dao.UserDAO;
import com.qr.anti.exception.BusinessException;
import com.qr.anti.po.UserPo;
import com.qr.anti.service.IUserService;
import com.qr.anti.vo.LoginVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author：胡侯东
 * @Date：2021/3/1 5:42 下午
 * @Desc:
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public UserPo login(LoginVo login) {
        //UserPo user = userDAO.login(login.getUserName(), login.getPassword());
        //if (Objects.isNull(user)) {
          //  throw new BusinessException("500","登陆失败!账号不存在或者密码错误");
        //}
        UserPo user = new UserPo();
        return user;
    }
}