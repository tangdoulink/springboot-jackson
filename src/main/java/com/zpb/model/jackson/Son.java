package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author       pengbo.zhao
 * @description  son-实体
 * @createDate   2021/11/16 14:08
 * @updateDate   2021/11/16 14:08
 * @version      1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder(value = {"version"})
public class Son extends Father{

    private String version;

    public Son(String name, Integer age, String version) {
        super(name, age);
        this.version = version;
    }
}
