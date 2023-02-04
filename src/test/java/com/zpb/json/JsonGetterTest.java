package com.zpb.json;

import com.zpb.model.jackson.Person;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  json-getter-测试
 * @createDate   2021/11/16 11:32
 * @updateDate   2021/11/16 11:32
 * @version      1.0
 */
@DisplayName("jsonGetter-test")
public class JsonGetterTest {

    @Test
    @DisplayName("jsonGetter-test")
    public void testJsonGetter(){
        Person person = new Person("李四", 24, null);
        System.err.println(JacksonUtil.writeValue(person));
    }

}
