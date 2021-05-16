package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;

public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Date now=(Date)context.getBean("now");
        System.out.println("Now is "+ now );
        System.out.println("update 1"+ now );
        System.out.println("update 2"+ now );
        System.out.println("dev1 update 1"+ now );
        System.out.println("master update 1"+ now );

    }
}
