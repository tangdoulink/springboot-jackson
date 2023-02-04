package com.zpb.json;

import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  别名-测试
 * @createDate   2021/11/15 20:35
 * @updateDate   2021/11/15 20:35
 * @version      1.0
 */
@DisplayName("别名-测试")
public class JsonAliasTest {

    @Test
    @DisplayName("jsonAlias")
    public void testJsonAlias(){
        String v = "{\"name\":\"alias\",\"flag\":true}";
        User user = JacksonUtil.readValue(v, User.class);
        System.err.println(JacksonUtil.writeValue(user,true));
    }

}
