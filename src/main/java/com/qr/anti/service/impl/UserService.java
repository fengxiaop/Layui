package com.qr.anti.service.impl;

import com.qr.anti.base.DataPageValue;
import com.qr.anti.base.PagingParamVo;
import com.qr.anti.dao.UserDAO;
import com.qr.anti.exception.BusinessException;
import com.qr.anti.po.UserPo;
import com.qr.anti.service.IUserService;
import com.qr.anti.util.MyBeanUtil;
import com.qr.anti.vo.LoginVo;
import com.qr.anti.vo.UserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public UserVo selectById(Long userId) {
        UserPo userPo = userDAO.queryById(userId);
        return MyBeanUtil.createBean(userPo, UserVo.class);
    }

    @Override
    public DataPageValue<UserVo> selectByPage(String username, Integer page, Integer pageSize) {
        //查询参数
        Map extra = new HashMap();
        extra.put("username", username);

        PagingParamVo param = new PagingParamVo();
        param.setExtra(extra);

        //设置分页参数
        param.setPage(page);
        param.setPageSize(pageSize);

        //查询总数
        Long count = userDAO.queryByCount(param);
        //设置总数
        param.getPager().setRowCount(count);
        //查询分页
        List<UserPo> pos = userDAO.queryByPage(param);

        //po转化为vo
        List<UserVo> userVos = MyBeanUtil.createList(pos, UserVo.class);

        return new DataPageValue<>(userVos, count, pageSize, page);
    }
}