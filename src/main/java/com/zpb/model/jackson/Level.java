package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/19 16:18
 * @updateDate   2021/11/19 16:18
 * @version      1.0
 */

public enum Level {

    /**
     * 等级
     */
    A, B, @JsonEnumDefaultValue UNKNOWN;

}
