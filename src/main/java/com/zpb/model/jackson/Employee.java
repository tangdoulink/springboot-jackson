package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/19 15:32
 * @updateDate   2021/11/19 15:32
 * @version      1.0
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, property = "short_class")
@JsonSubTypes({
        @JsonSubTypes.Type(value = InnerA.class, name = "innerA")
//        @JsonSubTypes.Type(value = Employee.InnerB.class, name = "innerB")
})
@Data
public class Employee {

    private Long id;

    private String name;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public Employee(@JsonProperty("id") Long id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public Employee(@JsonProperty("id") Long id) {
        this.id = id;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public Employee(@JsonProperty("name") String name) {
        this.name = name;

    }
}
