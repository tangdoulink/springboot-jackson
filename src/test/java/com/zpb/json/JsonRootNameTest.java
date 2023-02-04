package com.zpb.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zpb.model.jackson.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonRootName-测试
 * @createDate   2021/11/16 15:36
 * @updateDate   2021/11/16 15:36
 * @version      1.0
 */
@DisplayName("JsonROotName-test")
public class JsonRootNameTest {

    @Test
    @DisplayName("jsonRootName")
    public void testJsonRootName() throws JsonProcessingException {

        Person person = new Person("李四", 24,null);
        ObjectMapper objectMapper = new ObjectMapper();

        // 开启使用root_value,如果没有使用JsonRootName,默认是类名
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        System.err.println(objectMapper.writeValueAsString(person));

    }
}
