package com.qr.anti.service;

import com.qr.anti.po.UserPo;
import com.qr.anti.vo.LoginVo;

/**
 * @Author：胡侯东
 * @Date：2021/3/1 5:42 下午
 * @Desc:
 */
public interface IUserService {

    /**
     * 用户登陆
     */
    UserPo login(LoginVo login);
}