package com.qr.anti.dao;

import com.qr.anti.base.BaseRepository;
import com.qr.anti.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author：胡侯东
 * @Date：2021/3/1 4:30 下午
 * @Desc:
 */
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