package com.zpb.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zpb.model.jackson.Level;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonEnumDefaultValue-测试
 * @createDate   2021/11/19 16:21
 * @updateDate   2021/11/19 16:21
 * @version      1.0
 */
@DisplayName("jsonEnumDefaultValue-test")
public class JsonEnumDefaultValue {

    @Test
    @DisplayName("jsonEnumDefaultValue")
    public void testJsonEnumDefaultValue() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        // 反序列化时，未知的值用默认值代替
        objectMapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);

        String s1 = "\"A\"";
        String s2 = "\"B\"";
        String s3 = "\"AB\"";
        System.err.println(objectMapper.readValue(s1, Level.class));
        System.err.println(objectMapper.readValue(s2, Level.class));
        System.err.println(objectMapper.readValue(s3, Level.class));

    }

}
