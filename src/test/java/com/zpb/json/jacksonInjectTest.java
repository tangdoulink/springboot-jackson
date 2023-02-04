package com.zpb.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zpb.model.jackson.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jacksonInject-测试
 * @createDate   2021/11/18 15:11
 * @updateDate   2021/11/18 15:11
 * @version      1.0
 */
@DisplayName("jacksonInject-test")
public class jacksonInjectTest {

    @Test
    @DisplayName("jacksonInject-id")
    public void testJacksonInjectId() throws JsonProcessingException {
        String v = "{\"name\":\"李四\",\"password\":\"123456\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        InjectableValues.Std std = new InjectableValues.Std();
        std.addValue("injectId", "我是默认值-id");
        std.addValue(Double.class, 2.0d);
        objectMapper.setInjectableValues(std);
        System.err.println(objectMapper.readValue(v, Person.class));
    }

}
