package com.reapal.brave.main;

import com.reapal.gworder.entity.GwOrders;
import com.reapal.gworder.service.IGwOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jack-cooper on 2017/2/20.
 */
@Component
public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath*:spring-consumer.xml"
        });
        context.start();
        String interfaceName= "com.reapal.gworder.IGworderService";

        String  serverName =  interfaceName.substring(interfaceName.lastIndexOf(".")+1);
        System.out.println("serverName = " + serverName);
    }



}
