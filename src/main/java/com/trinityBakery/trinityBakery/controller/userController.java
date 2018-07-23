package com.trinityBakery.trinityBakery.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class userController {
    
    @RequestMapping("shopping")
    public String shopping() {
        return "shopping";
    }
    
    @RequestMapping("shoppingcart")
    public String shoppingcart() {
        return "shoppingcart";
    }
    
    @RequestMapping("user-order")
    public String user_order() {
        return "user-order";
    }
    
    @RequestMapping("user-order-detail")
    public String user_order_detail() {
        return "user-order-detail";
    }
    
    @RequestMapping("user-refund")
    public String user_refund() {
        return "user-refund";
    }
    
    @RequestMapping("user-refund-detail")
    public String user_refund_detail() {
        return "user-refund-detail";
    }

}