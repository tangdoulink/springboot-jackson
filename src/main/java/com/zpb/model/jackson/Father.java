package com.zpb.model.jackson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author       pengbo.zhao
 * @description  father-实体
 * @createDate   2021/11/16 14:06
 * @updateDate   2021/11/16 14:06
 * @version      1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Father {

    private String name;

    private Integer age;


}
