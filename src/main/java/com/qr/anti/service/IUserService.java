package com.qr.anti.service;

import com.qr.anti.po.UserPo;
import com.qr.anti.vo.LoginVo;

public interface IUserService {

    /**
     * 用户登陆
     */
    UserPo login(LoginVo login);
}