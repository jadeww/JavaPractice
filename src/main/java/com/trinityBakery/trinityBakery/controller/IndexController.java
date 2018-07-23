package com.trinityBakery.trinityBakery.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletInputStream;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping(value = {"/", "/login"})
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    String get() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    String post(HttpServletRequest request, Map<String, Object> map) {
        String password = request.getParameter("password");
        String account = request.getParameter("account");
        System.out.println("password is:" + password);
        if (!StringUtils.isEmpty(account)) {
            //登陆成功
            if ("user".equals(password)) {
                return "shopping";
            } else if ("sale".equals(password)) {
                return "sale";
            } else if ("account".equals(password)) {
                return "finance-account";
            } else if ("cashier".equals(password)) {
                return "finance-cashier";
            } else if ("pps".equals(password)) {
                return "ProductionPlanningSection";
            } else if ("fpl".equals(password)) {
                return "finishedProducLibrary";
            } else if ("boss".equals(password)) {
                return "boss";
            } else if ("admin".equals(password)) {
                return "Admin";
            } else if ("production".equals(password)) {
                return "productionWork";
            } else return "login";
        } else {
            //登陆失败
            map.put("msg", "用户名密码错误");
            return "login";
        }

    }
}