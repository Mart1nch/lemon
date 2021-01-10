package com.orchard.lemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Date 2021/1/9
 * @Author by matian
 */
@Controller
@RequestMapping("/boot")
public class BootController {

    @RequestMapping(value = "/helloworld")
    @ResponseBody
    public String helloworld() {
        return "helloworld";
    }

    @RequestMapping(value ="/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

}
