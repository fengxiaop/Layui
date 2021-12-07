package com.qr.anti.dao;

import com.qr.anti.base.BaseRepository;
import com.qr.anti.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO extends BaseRepository<UserPo> {

    /**
     * 登陆
     * @param userName
     * @param password
     * @return
     */
    UserPo login(String userName, String password);
}