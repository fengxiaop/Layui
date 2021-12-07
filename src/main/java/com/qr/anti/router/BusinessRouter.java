package com.qr.anti.router;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessRouter {

    @GetMapping("/forward")
    public String forward(String page) {
        return page;
    }
}