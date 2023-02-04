package com.zpb.model.properties;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2022/4/17 00:46
 * @updateDate   2022/4/17 00:46
 * @version      1.0
 */
@Data
@AllArgsConstructor
@JsonPropertyOrder("registryTime,saasApiList")
public class SaasApis {

    private String registryTime;

    List<SaasApi> saasApiList;

    public SaasApis(SaasApi ...saasApis) {
        saasApiList = Arrays.asList(saasApis);
    }

}
