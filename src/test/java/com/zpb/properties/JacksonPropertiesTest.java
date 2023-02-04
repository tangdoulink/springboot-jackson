package com.zpb.properties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import com.zpb.model.properties.Point;
import com.zpb.model.properties.Points;
import com.zpb.model.properties.SaasApi;
import com.zpb.model.properties.SaasApis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2022/4/17 18:30
 * @updateDate   2022/4/17 18:30
 * @version      1.0
 */
@DisplayName("jackson-properties测试")
class JacksonPropertiesTest {

    private final JavaPropsMapper MAPPER = new JavaPropsMapper();

    @Test
    @DisplayName("json转换成properties")
    void testJsonToProperties() throws IOException {
        Properties props = new Properties();
        props.put("a.b", "14");
        props.put("x", "foo");
        Map<?,?> result = MAPPER.readPropertiesAs(props, Map.class);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("foo", result.get("x"));
        Object ob = result.get("a");
        assertNotNull(ob);
        assertTrue(ob instanceof Map<?,?>);
        Map<?,?> m2 = (Map<?,?>) ob;
        assertEquals(1, m2.size());
        assertEquals("14", m2.get("b"));
        System.err.println(MAPPER.writeValueAsString(props));
    }

    @Test
    void test1() throws IOException {
        Points input = new Points
                (new Point(1, 2), new Point(3, 4), new Point(5, 6));
        String output = MAPPER.writeValueAsString(input);
        System.err.println(output);

        Properties properties = MAPPER.writeValueAsProperties(input);
        System.err.println(properties);
    }

    @Test
    void test2() throws JsonProcessingException {
        SaasApis saasApis = new SaasApis(
                new SaasApi("schedule/user", "get", "private", "查询获取用户信息"),
                new SaasApi("schedule/user", "post", "private", "新增用户信息"),
                new SaasApi("schedule/user", "put", "private", "更新用户信息"),
                new SaasApi("schedule/user", "delete", "private", "删除用户信息"));
        saasApis.setRegistryTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        MAPPER.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String output = MAPPER.writeValueAsString(saasApis);
        System.err.println(output);
    }
}


