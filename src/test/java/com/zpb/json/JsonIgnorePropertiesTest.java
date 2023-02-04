package com.zpb.json;

import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonIgnoreProperties-测试
 * @createDate   2021/11/15 17:25
 * @updateDate   2021/11/15 17:25
 * @version      1.0
 */
@DisplayName("jsonIgnoreProperties-测试")
public class JsonIgnorePropertiesTest {

    @Test
    @DisplayName("jsonIgnoreProperties-测试")
    public void testJsonIgnoreProperties(){
        User user1 = new User("张三",23,1f, 2f);
        User user2 = new User("李四",24,3f, 4f);

        // 序列化
        System.err.println(JacksonUtil.writeValue(user1, true));
        System.err.println(JacksonUtil.writeValue(user2, true));

        // 反序列化
        String v = "{\"name\":\"张三\",\"age\":24,\"jsonIgnore1\":\"1f\",\"jsonIgnore2\":\"2f\"}";
        User readUser = JacksonUtil.readValue(v, User.class);
        System.err.println("反序列化："+readUser);

    }
}
