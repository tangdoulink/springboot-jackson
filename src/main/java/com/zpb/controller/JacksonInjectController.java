package com.zpb.controller;

import com.zpb.model.jackson.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author       pengbo.zhao
 * @description  jacksonInject-controller
 * @createDate   2021/11/18 15:50
 * @updateDate   2021/11/18 15:50
 * @version      1.0
 */
@RestController("jackson/")
public class JacksonInjectController {

    @PostMapping("inject")
    public Object getInject(@RequestBody Person person){
//        JavaTimeModule
        System.err.println(person);
        return person;
    }

}
