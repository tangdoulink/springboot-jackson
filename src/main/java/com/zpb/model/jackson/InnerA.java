package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/19 17:42
 * @updateDate   2021/11/19 17:42
 * @version      1.0
 */
@JsonTypeName("innerA")
public class InnerA extends Employee{

    private String innerA;

    public InnerA(Long id, String name, String innerA) {
        super(id,name);
        this.innerA = innerA;
    }

}
