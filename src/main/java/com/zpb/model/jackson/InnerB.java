package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/19 17:43
 * @updateDate   2021/11/19 17:43
 * @version      1.0
 */
@JsonTypeName("innerB")
public class InnerB {

    private String innerB;

    public InnerB(String innerB) {
        this.innerB = innerB;
    }

}
