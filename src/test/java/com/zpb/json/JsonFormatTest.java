package com.zpb.json;

import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author       pengbo.zhao
 * @description  jsonFormat-日期格式化
 * @createDate   2021/11/15 19:52
 * @updateDate   2021/11/15 19:52
 * @version      1.0
 */
@DisplayName("jsonFormat-日期格式化")
public class JsonFormatTest {

    @Test
    @DisplayName("jsonFormat")
    public void testJsonFormat(){

        User user = new User("张三", 23, new Date());
        System.err.println(user);

        // 序列化
        System.err.println(JacksonUtil.writeValue(user, true));

    }

}
