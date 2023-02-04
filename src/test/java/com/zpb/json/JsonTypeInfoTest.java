package com.zpb.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.zpb.model.jackson.Employee;
import com.zpb.model.jackson.InnerA;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonTypeInfo-测试
 * @createDate   2021/11/19 16:41
 * @updateDate   2021/11/19 16:41
 * @version      1.0
 */
@DisplayName("jsonTypeInfo-test")
public class JsonTypeInfoTest {

    @Test
    @DisplayName("jsonTypeInfo")
    public void testJsonTypeInfo() throws JsonProcessingException {
        Employee employee = new Employee(1000L, "张三");
        ObjectWriter objectMapper = new ObjectMapper().writerWithDefaultPrettyPrinter();

        String s = objectMapper.writeValueAsString(employee);
        System.err.println(s);

    }

    @Test
    @DisplayName("jsonTypeInfo-InnerA")
    public void testJsonTypeInfoInnerA() throws JsonProcessingException {
        InnerA innerA = new InnerA(1000L,"张三","innerA");
        ObjectWriter objectMapper = new ObjectMapper().writerWithDefaultPrettyPrinter();
        String s = objectMapper.writeValueAsString(innerA);
        System.err.println(s);

    }


}
