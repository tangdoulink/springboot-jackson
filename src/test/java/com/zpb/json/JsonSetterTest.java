package com.zpb.json;

import com.zpb.model.jackson.Person;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  json-setter-测试
 * @createDate   2021/11/16 11:35
 * @updateDate   2021/11/16 11:35
 * @version      1.0
 */
@DisplayName("jsonSetter-test")
public class JsonSetterTest {

    @Test
    @DisplayName("jsonSetter")
    public void testJsonSetter(){
        String v = "{\"name\":\"李四\",\"age\":24}";
        System.err.println(JacksonUtil.readValue(v, Person.class));

    }

}
