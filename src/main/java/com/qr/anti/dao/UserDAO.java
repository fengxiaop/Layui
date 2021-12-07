package com.qr.anti.dao;

import com.qr.anti.base.BaseRepository;
import com.qr.anti.base.PagingParamVo;
import com.qr.anti.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO extends BaseRepository<UserPo> {

    /**
     * 登陆
     * @param userName
     * @param password
     * @return
     */
    UserPo login(String userName, String password);

    /**
     * 分页查询总数
     * @param param
     * @return
     */
    Long queryByCount(PagingParamVo param);

    /**
     * 分页查询
     * @param param
     * @return
     */
    List<UserPo> queryByPage(PagingParamVo param);
}