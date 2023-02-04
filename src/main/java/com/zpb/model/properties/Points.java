package com.zpb.model.properties;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2022/4/18 10:55
 * @updateDate   2022/4/18 10:55
 * @version      1.0
 */
@Data
public class Points {

    public List<Point> p;

    public Points(Point... p0) {
        p = Arrays.asList(p0);
    }

}
