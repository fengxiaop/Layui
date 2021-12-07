package com.qr.anti.router;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author：胡侯东
 * @Date：2021/3/1 2:04 下午
 * @Desc:
 */
@Controller
public class BusinessRouter {

    @GetMapping("/forward")
    public String forward(String page) {
        return page;
    }
}