package com.zpb.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zpb.model.jackson.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonCreator-测试
 * @createDate   2021/11/19 10:51
 * @updateDate   2021/11/19 10:51
 * @version      1.0
 */
@DisplayName("jsonCreator-test")
public class JsonCreatorTest {

    @Test
    @DisplayName("jsonCreator")
    public void testJsonCreator() throws JsonProcessingException {
        String v1 = "{\"name\":\"李四\",\"id\":1000}";
        String v2 = "{\"name\":\"李四\"}";
        String v3 = "{\"id\":1000}";
        System.err.println(new ObjectMapper().readValue(v1, Employee.class));
        System.err.println(new ObjectMapper().readValue(v2, Employee.class));
        System.err.println(new ObjectMapper().readValue(v3, Employee.class));
    }

}
