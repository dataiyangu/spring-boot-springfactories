package com.leesin.lalala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 11:33
 * @version: ${VERSION}
 * @modified By:
 */
@Configuration
public class ConfigDemo {
    @Bean
    public BeanDemo bean () {
        return new BeanDemo();
    }
}
