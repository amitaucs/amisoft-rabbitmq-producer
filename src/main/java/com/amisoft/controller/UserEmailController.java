package com.amisoft.controller;

import com.amisoft.config.RabbitMQMessageConstant;
import com.amisoft.dto.UserEmail;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amitdatta on 26/07/17.
 */

@RestController
public class UserEmailController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "/user/email", method = RequestMethod.GET)
    public void emailUser(){

        UserEmail email = new UserEmail("amit.aucs@gmail.com","Hello Amit");
        rabbitTemplate.convertAndSend(RabbitMQMessageConstant.EXCHANGE_ANME,RabbitMQMessageConstant.ROUTING_KEY,email);
    }

}
