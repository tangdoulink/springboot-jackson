package com.zpb.controller;

import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;

import java.util.Date;

/**
 * @author       pengbo.zhao
 * @description  jackson-controller
 * @createDate   2021/11/12 17:40
 * @updateDate   2021/11/12 17:40
 * @version      1.0
 */
public class JacksonController {

    public static void main(String[] args) {
        User user1 = new User("张三", 23, System.currentTimeMillis(), new Date());
//        User user2 = new User("李四", 24, System.currentTimeMillis(), new Date());
//        User user3 = new User("王五", 25, System.currentTimeMillis(), new Date());
        System.err.println(JacksonUtil.writeValue(user1));

    }
}
