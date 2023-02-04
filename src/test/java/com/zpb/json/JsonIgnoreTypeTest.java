package com.zpb.json;

import com.zpb.model.jackson.Address;
import com.zpb.model.jackson.User;
import com.zpb.utils.JacksonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author       pengbo.zhao
 * @description  类-忽略
 * @createDate   2021/11/15 21:56
 * @updateDate   2021/11/15 21:56
 * @version      1.0
 */
@DisplayName("类-忽略")
public class JsonIgnoreTypeTest {

    @Test
    @DisplayName("类-忽略")
    public void testJsonIgnoreType(){

        User user = new User("张三", 23, new Address("北京", "北京", "朝阳", "大屯"));

        System.err.println(JacksonUtil.writeValue(user,true));
    }

}
