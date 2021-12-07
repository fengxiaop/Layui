package com.qr.anti.service;

import com.qr.anti.base.DataPageValue;
import com.qr.anti.po.UserPo;
import com.qr.anti.vo.LoginVo;
import com.qr.anti.vo.UserVo;

public interface IUserService {

    /**
     * 用户登陆
     */
    UserPo login(LoginVo login);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    UserVo selectById(Long userId);

    /**
     * 分页查询用户
     * @param username
     * @param page
     * @param pageSize
     * @return
     */
    DataPageValue<UserVo> selectByPage(String username, Integer page, Integer pageSize);
}