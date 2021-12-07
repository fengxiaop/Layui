package com.qr.anti.api;

import com.qr.anti.base.DataValue;
import com.qr.anti.service.IUserService;
import com.qr.anti.vo.LoginVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.UUID;


@RestController
@RequestMapping(value = "/api/pc/login")
public class LoginPC  {

    @Resource
    private IUserService userService;

    @PostMapping("/userLogin")
    public DataValue<String> login(@RequestBody LoginVo login) {
        userService.login(login);
        String token = UUID.randomUUID().toString();
        //RedisUtil.getInstance().set(token, token, 60 * 60 * 8);
        //SessionUtil.setValue(LoginConstants.TOKEN, token);
        return DataValue.success(token);
    }
}