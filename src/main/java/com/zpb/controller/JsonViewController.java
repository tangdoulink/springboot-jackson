package com.zpb.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.zpb.model.jackson.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author       pengbo.zhao
 * @description  jsonView-controller
 * @createDate   2021/11/17 20:46
 * @updateDate   2021/11/17 20:46
 * @version      1.0
 */
@RestController
@RequestMapping("json/view/")
public class JsonViewController {

    @JsonView(Person.PersonAge.class)
    @GetMapping("a")
    public Object personAge(){
        return new Person("李四", 24, null, "123456");
    }

    @JsonView(Person.PersonPassword.class)
    @GetMapping("p")
    public Object personPassword(){
        return new Person("李四", 24, null, "123456");
    }

    @JsonView(Person.PersonAgePassword.class)
    @GetMapping("ap")
    public Object personAgePassword(){
        return new Person("李四", 24, null, "123456");
    }

}
