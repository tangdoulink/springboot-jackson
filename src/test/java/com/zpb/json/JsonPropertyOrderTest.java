package com.zpb.json;

import com.zpb.model.jackson.Person;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonPropertyOrder-测试
 * @createDate   2021/11/16 14:10
 * @updateDate   2021/11/16 14:10
 * @version      1.0
 */
@DisplayName("jsonPropertyOrder-test")
public class JsonPropertyOrderTest {

    @Test
    @DisplayName("jsonPropertyOrder")
    public void testPropertyOrder(){
        Person person = new Person("李四", 24, null);
        System.err.println(JacksonUtil.writeValue(person));
    }

}
