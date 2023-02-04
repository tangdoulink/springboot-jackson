package com.zpb.json;

import com.zpb.model.jackson.Person;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * @author       pengbo.zhao
 * @description  anySetter-测试
 * @createDate   2021/11/16 11:04
 * @updateDate   2021/11/16 11:04
 * @version      1.0
 */
@DisplayName("jsonAnySetter")
public class JsonAnySetterTest {

    @Test
    @DisplayName("jsonAnySetter-test")
    public void testJsonAnySetter(){
        String v = "{\"name\":\"李四\",\"age\":24,\"currentTime\":1636943356921,\"date\":1636943356921}";

        Person person = JacksonUtil.readValue(v, Person.class);
        System.err.println(JacksonUtil.writeValue(person));
    }
}
