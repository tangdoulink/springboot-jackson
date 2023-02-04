package com.zpb.json;

import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author       pengbo.zhao
 * @description  jsonProperty-测试
 * @createDate   2021/11/15 10:17
 * @updateDate   2021/11/15 10:17
 * @version      1.0
 */

public class JsonPropertyTest {


    @Test
    @DisplayName(value = "jsonProperty-value")
    public void testJsonPropertyValue(){
        User user = new User("张三", 23,System.currentTimeMillis(),new Date());
        String value = JacksonUtil.writeValue(user);
        System.err.println(value);

        String v = "{\"age\":24,\"currentTime\":1636943356921,\"date\":1636943356921,\"nickName\":\"张三\"}";
        User user1 = JacksonUtil.readValue(v, User.class);
        System.err.println("user1:" + user1);

    }

    @Test
    @DisplayName(value = "jsonProperty-required")
    public void testJsonPropertyRequired(){
        String v = "{\"age\":24}";
        User user = JacksonUtil.readValue(v,User.class);
        System.err.println(user);

    }

    @Test
    @DisplayName(value = "jsonProperty-index")
    public void testJsonPropertyIndex(){
        User user = new User("张三", 24,System.currentTimeMillis(),new Date());
        String value = JacksonUtil.writeValue(user);
        System.err.println(value);
    }

    @Test
    @DisplayName(value = "jsonProperty-defaultValue")
    public void testJsonPropertyDefaultValue(){
        User user = new User(null, 24,System.currentTimeMillis(),new Date());
        String value = JacksonUtil.writeValue(user);
        System.err.println(value);
    }

    @Test
    @DisplayName(value = "jsonProperty-access")
    public void testJsonPropertyDefaultAccess(){
        User user = new User(null, 24,System.currentTimeMillis(),new Date());
        String value = JacksonUtil.writeValue(user);
        System.err.println(value);
    }

    @Test
    @DisplayName(value = "jsonProperty-access")
    public void testJsonPropertyAccess(){
        String auto = "{\"readOnly\":\"ro\",\"writeOnly\":\"wo\",\"readWrite\":\"rw\",\"auto\":\"auto\"}";

        // 序列化
        User user1 = new User("ro", "wo","rw","auto");
        System.err.println("序列化："+JacksonUtil.writeValue(user1,true));

        // 反序列化
        User ao = JacksonUtil.readValue(auto,User.class);
        System.err.println("ao 反序列化:"+ao);
        System.err.println("ao 序列化:"+JacksonUtil.writeValue(ao,true));

    }

    @Test
    @DisplayName("jsonIgnore")
    public void testJsonIgnore(){

    }

}
