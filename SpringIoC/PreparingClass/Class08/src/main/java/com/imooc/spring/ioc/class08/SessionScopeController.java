package com.imooc.spring.ioc.class08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionScopeController {

    @GetMapping("testSessionScope")
    @ResponseBody
    public String test() {
        return this.toString();
    }
}
