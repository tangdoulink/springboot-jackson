package com.zpb.json;

import com.zpb.model.jackson.Address;
import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  jsonUnwrapped-测试
 * @createDate   2021/11/15 17:41
 * @updateDate   2021/11/15 17:41
 * @version      1.0
 */
@DisplayName("jsonUnwrapped-测试")
public class JsonUnwrappedTest {

    @Test
    @DisplayName("jsonUnwrapped-测试")
    public void testJsonUnwrapped(){

        // 序列化
        User user = new User("张三", 23);
        Address address = new Address("北京", "北京", "朝阳", "大屯路");
        user.setAddress(address);
        String writeValue = JacksonUtil.writeValue(user, true);
        System.err.println("序列化："+writeValue);

        // 反序列化
        User readValue = JacksonUtil.readValue(writeValue, User.class);
        System.err.println("反序列化："+readValue);

    }

}
