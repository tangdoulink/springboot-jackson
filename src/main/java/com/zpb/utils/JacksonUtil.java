package com.zpb.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

/**
 * @author       pengbo.zhao
 * @description  JacksonUtil
 * @createDate   2021/11/12 18:11
 * @updateDate   2021/11/12 18:11
 * @version      1.0
 */

public class JacksonUtil {

    static ObjectMapper objectMapper = new ObjectMapper();

    static {
//        // 序列化时：不包含为Null的属性
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//
//        // 序列化时：不包含为空的属性
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

    }

    public static ObjectMapper isDateFormat(boolean isDateFormat){
        if(isDateFormat){
            return objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        }
        return objectMapper;
    }

    public static <T> T readValue(String jsonString, boolean isDateFormat, Class<T> clazz){
            try {
                if(isDateFormat) {
                    return isDateFormat(isDateFormat).readValue(jsonString, clazz);
                }
                return readValue(jsonString,clazz);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return null;
    }

    public static <T> T readValue(String jsonString, Class<T> clazz){
        try {
            return objectMapper.readValue(jsonString,clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.err.println("jackson string convert object error ");
        }
        return null;
    }

    public static <T> String writeValue(T t, boolean notNull){
        try {
            return setNotNull(notNull).writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.err.println("jackson object convert string error ");
        }
        return null;
    }

    private static ObjectMapper setNotNull(boolean notNull){
        if(notNull){
            return JacksonUtil.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        }
        return objectMapper;
    }
    public static <T> String writeValue(T t){
        try {
            return objectMapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.err.println("jackson object convert string error ");
        }
        return null;
    }

    public static <T> T get (){



        return null;
    }
}
