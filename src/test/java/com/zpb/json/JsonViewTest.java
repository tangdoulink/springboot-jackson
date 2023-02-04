package com.zpb.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zpb.model.jackson.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonView-测试
 * @createDate   2021/11/16 16:22
 * @updateDate   2021/11/16 16:22
 * @version      1.0
 */
@DisplayName("jsonView-test")
public class JsonViewTest {

    @Test
    @DisplayName("jsonView")
    public void testJsonView() throws JsonProcessingException {

        Person person = new Person("李四", 24, null, "123456");

        ObjectMapper objectMapper = new ObjectMapper();
        String s1 = objectMapper.writerWithView(Person.PersonAge.class).writeValueAsString(person);
        System.err.println(" 带 age 的视图："+ s1);

        String s2 = objectMapper.writerWithView(Person.PersonPassword.class).writeValueAsString(person);
        System.err.println(" 带 password 的视图："+s2);

        String v3 = objectMapper.writerWithView(Person.PersonAgePassword.class).writeValueAsString(person);
        System.err.println(" 带 age password 的视图："+v3);

    }

}
