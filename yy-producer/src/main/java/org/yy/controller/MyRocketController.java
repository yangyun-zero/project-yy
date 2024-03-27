package org.yy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yy.mq.MyRocketProducer;

@RestController
@RequestMapping("/myRocket")
public class MyRocketController {

    @Autowired
    private MyRocketProducer myRocketProducer;


    @GetMapping("/testSendMessage")
    public void testSendMessage (@RequestParam("message") String message){
        myRocketProducer.sendMessage("test", message);
    }
}
