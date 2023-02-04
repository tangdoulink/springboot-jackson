package com.zpb.model.properties;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author       pengbo.zhao
 * @description  api-model
 * @createDate   2022/4/16 14:09
 * @updateDate   2022/4/16 14:09
 * @version      1.0
 */
@Data
@AllArgsConstructor
public class SaasApi implements Serializable {

    private static final long serialVersionUID = 192907610564186361L;

    /**
     * api-path
     */
    private String url;

    /**
     * 请求类型
     */
    private String methods;

    /**
     * api-权限
     */
    private String permission;

    /**
     * api-描述信息
     */
    private String info;

}
