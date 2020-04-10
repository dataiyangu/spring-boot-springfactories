package com.leesin.lalala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 11:37
 * @version: ${VERSION}
 * @modified By:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigDemo.class);
    }
}
