package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author       pengbo.zhao
 * @description  User
 * @createDate   2021/11/12 17:41
 * @updateDate   2021/11/12 17:41
 * @version      1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreType

@JsonIgnoreProperties(value = {"jsonIgnore1","jsonIgnore2"})
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(index = 1)
    private Integer age;

    private Long currentTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss",iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern="yyyy-MM-dd HH:dd:mm",timezone="GMT+8")
    private Date date;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String readOnly;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String writeOnly;

    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private String readWrite;

    @JsonProperty(access = JsonProperty.Access.AUTO)
    private String auto;

    @JsonIgnore(value = true)
    private String jsonIgnore;

    private Float jsonIgnore1;

    private Float jsonIgnore2;


    @JsonUnwrapped(prefix = "address_",suffix = "_ss")
    private Address address;

    @JsonAlias(value = {"alias"})
    private String jsonAlias;

    private String snakeCase;


    @JsonCreator
    public User(@JsonProperty(value = "name",required = false) String name, @JsonProperty(value = "age",required = false) Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, Integer age, Long currentTime, Date date) {
        this.name = name;
        this.age = age;
        this.currentTime = currentTime;
        this.date = date;
    }

    public User(String readOnly) {
        this.readOnly = readOnly;
    }

    public User(String readOnly,String writeOnly) {
        this.readOnly = readOnly;
        this.writeOnly = writeOnly;
    }

    public User(String readOnly, String writeOnly, String readWrite) {
        this.readOnly = readOnly;
        this.writeOnly = writeOnly;
        this.readWrite = readWrite;
    }

    public User(String readOnly, String writeOnly, String readWrite, String auto) {
        this.readOnly = readOnly;
        this.writeOnly = writeOnly;
        this.readWrite = readWrite;
        this.auto = auto;
    }

    public User(String name, Integer age,String jsonIgnore) {
        this.name = name;
        this.age = age;
        this.jsonIgnore = jsonIgnore;
    }

    public User(String name, Integer age,Float jsonIgnore1, Float jsonIgnore2) {
        this.name = name;
        this.age = age;
        this.jsonIgnore1 = jsonIgnore1;
        this.jsonIgnore2 = jsonIgnore2;
    }

    public User(String name, Integer age,Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User(String name, Integer age, Date date){
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public User(String jsonAlias, boolean flag) {
        this.jsonAlias = jsonAlias;
    }

}
