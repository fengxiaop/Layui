package com.qr.anti.api;

import com.qr.anti.base.DataPageValue;
import com.qr.anti.base.DataValue;
import com.qr.anti.base.ReturnValue;
import com.qr.anti.service.IUserService;
import com.qr.anti.vo.UserVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/user")
public class UserApi {

    @Resource
    private IUserService userService;

    /**
     * 查询用户详情
     * @param userId
     * @return
     */
    @GetMapping("/selectById")
    @ResponseBody
    public DataValue<UserVo> selectById(Long userId) {
        UserVo userVo = userService.selectById(userId);
        return DataValue.success(userVo);
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @PostMapping("/deleteById")
    @ResponseBody
    public DataValue<UserVo> deleteById(Long userId) {
//        UserVo userVo = userService.deleteById(userId);
        UserVo userVo = new UserVo();
        return DataValue.success(userVo);
    }

    /**
     * 分页查询用户
     * @param username
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/selectByPage")
    @ResponseBody
    public DataPageValue<UserVo> selectByPage(String username, Integer page, Integer pageSize) {
        return userService.selectByPage(username, page, pageSize);
    }

    /**
     * 更新用户信息
     * @param userVo
     * @return
     */
    @PostMapping("/updateById")
    @ResponseBody
    public ReturnValue updateById(UserVo userVo) {
        //userService.updateById(userVo);
        return ReturnValue.success();
    }

}