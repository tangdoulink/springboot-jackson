package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author       pengbo.zhao
 * @description  地址-po
 * @createDate   2021/11/15 17:42
 * @updateDate   2021/11/15 17:42
 * @version      1.0
 */
@Data
@JsonIgnoreType
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 街道
     */
    private String street;

}
