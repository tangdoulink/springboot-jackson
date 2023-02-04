package com.zpb.json;

import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  JsonIgnore-测试
 * @createDate   2021/11/15 17:09
 * @updateDate   2021/11/15 17:09
 * @version      1.0
 */
@DisplayName("JsonIgnore-测试")
public class JsonIgnoreTest {

    @Test
    @DisplayName("jsonIgnore")
    public void jsonIgnore(){

        // 序列化
        User user = new User("张三", 23, "ignore");
        System.err.println(JacksonUtil.writeValue(user, true));

        // 反序列化
        String v = "{\"name\":\"张三\",\"age\":24,\"jsonIgnore\":\"ignore\"}";
        User readUser = JacksonUtil.readValue(v, User.class);
        System.err.println("反序列化："+readUser);

    }
}
