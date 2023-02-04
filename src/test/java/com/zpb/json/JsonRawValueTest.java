package com.zpb.json;

import com.zpb.model.jackson.Person;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonRawValue-测试
 * @createDate   2021/11/16 15:01
 * @updateDate   2021/11/16 15:01
 * @version      1.0
 */
@DisplayName("jsonRawValue-test")
public class JsonRawValueTest {

    @Test
    @DisplayName("jsonRawValue")
    public void testJsonRawValue(){

        Person person1 = new Person("张三", "\"test\"");
        System.err.println("before:"+person1);
        System.err.println(JacksonUtil.writeValue(person1, true));

        Person person2 = new Person("张三", "{\"author\":\"tom\", \"content\":\"unit test jackson\"}");
        System.err.println("before:"+person2);
        System.err.println(JacksonUtil.writeValue(person2, true));

    }

}
