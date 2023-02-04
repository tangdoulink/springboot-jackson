package com.zpb.json;

import com.zpb.model.jackson.Person;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonValue-测试
 * @createDate   2021/11/16 15:31
 * @updateDate   2021/11/16 15:31
 * @version      1.0
 */
@DisplayName("jsonValue-test")
public class JsonValueTest {

    @Test
    @DisplayName("jsonValue")
    public void testJsonValue(){

        Person person = new Person("李四", 1.1f);
        System.err.println(JacksonUtil.writeValue(person));

    }
}
