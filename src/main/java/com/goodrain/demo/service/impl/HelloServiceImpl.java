package com.goodrain.demo.service.impl;

import com.goodrain.demo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by conanca on 15-5-28.
 */
@Service
public class HelloServiceImpl implements HelloService {
    private static Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    public void say() {
        logger.info("say...");
        System.out.println("Hello world!");
    }
}
