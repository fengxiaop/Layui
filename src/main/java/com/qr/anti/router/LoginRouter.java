package com.qr.anti.router;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginRouter {

    @GetMapping("/")
    public String index() {
        //if (LoginUtil.isLogin()) {
            //return main();
       // }
        return "/login";
    }

    @GetMapping("/admin/main")
    public String main() {
        return "/main";
    }

    @GetMapping("/logout")
    public String logout() {
        //String token = SessionUtil.getValue(LoginConstants.TOKEN, String.class);
        //RedisUtil.getInstance().del(token);
        //SessionUtil.invalidate();
        return "forward:/login";
    }
}