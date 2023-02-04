package com.zpb.json;

import com.zpb.model.jackson.Person;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author       pengbo.zhao
 * @description  anyGetter-测试
 * @createDate   2021/11/16 10:37
 * @updateDate   2021/11/16 10:37
 * @version      1.0
 */
@DisplayName("jsonAnyGetter")
public class JsonAnyGetterTest {

    @Test
    @DisplayName("jsonAnyGetter-test")
    public void testJsonAnyGetter(){
        Map<String,String> descriptionMap = new HashMap<>();
        descriptionMap.put("version","v1");
        descriptionMap.put("jackson","test");

        Person person = new Person("李四", 24, descriptionMap);

        System.err.println(JacksonUtil.writeValue(person));
    }

}
