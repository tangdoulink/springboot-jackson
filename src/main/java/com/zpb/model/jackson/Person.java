package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/16 10:35
 * @updateDate   2021/11/16 10:35
 * @version      1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder(value = {"age","name"})
@JsonRootName("person")
public class Person {

    private String name;

    @JsonView(PersonAge.class)
    private Integer age;

    @JsonIgnore
    private Map<String,String> descriptionMap;

    @JsonIgnore
    @JsonAnySetter
    private Map<String, String> setterMap = new HashMap<>();

    @JsonRawValue
    private String rawValue;

//    @JsonValue
    private Float jsonValue;

    @JsonView(PersonPassword.class)
    private String password;

    public interface PersonAge{}

    public interface PersonPassword{}

    public static class PersonAgePassword implements PersonAge,PersonPassword{}

    public void setter(String key, String value){
        setterMap.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, String> getDescriptionMap(){
        return descriptionMap;
    }

    @JsonGetter("nickName")
    public String getName(){
        return name;
    }

    @JsonSetter("name")
    public void setName(String name){
        this.name = name;
    }

//    @JacksonInject(value = "injectId")
    private String injectId;

//    @JacksonInject
    private Double injectType;

    public Person(String name, Integer age, Map<String, String> descriptionMap) {
        this.name = name;
        this.age = age;
        this.descriptionMap = descriptionMap;
    }

//    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
//    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES) // 不能注入参数
//    @JsonCreator(mode = JsonCreator.Mode.DISABLED) // 没有设置默认值
    @JsonCreator(mode = JsonCreator.Mode.DEFAULT)
    public Person (@JsonProperty("name") String name, @JsonProperty("age") int age){
       this.name = name;
       this.age = age;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public Person (String name){
        this.name = name;
    }


    public Person(String name, String rawValue) {
        this.name = name;
        this.rawValue = rawValue;
    }

    public Person(String name, Float jsonValue) {
        this.name = name;
        this.jsonValue = jsonValue;
    }

    public Person(String name, Integer age,Map<String, String> descriptionMap, String password) {
        this.name = name;
        this.age = age;
        this.descriptionMap = descriptionMap;
        this.password = password;
    }

    public Person(String name, String password, String inject) {
        this.name = name;
        this.password = password;
        this.injectId = inject;
    }

    public Person(String name, String password, Double injectType) {
        this.name = name;
        this.password = password;
        this.injectType = injectType;
    }

}
