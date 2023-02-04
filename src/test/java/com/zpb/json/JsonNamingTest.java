package com.zpb.json;

import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  字段名-测试
 * @createDate   2021/11/15 21:30
 * @updateDate   2021/11/15 21:30
 * @version      1.0
 */
@DisplayName("JsonNaming-test")
public class JsonNamingTest {


    @Test
    @DisplayName("jsonNaming-test")
    public void testJsonNamingTest(){
        User user = new User("ro","wo","rw","auto");
        System.err.println(JacksonUtil.writeValue(user,true));
    }

}
