package com.zpb.model.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

import static java.util.Collections.emptyMap;
import static java.util.Collections.unmodifiableMap;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/11/19 14:26
 * @updateDate   2021/11/19 14:26
 * @version      1.0
 */

public class TagRequest {

    private Map<String, String> tags;

    private Long start;

    private Long end;

    private Long timestamp;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public TagRequest(@JsonProperty("tags") Map<String, String> tags, @JsonProperty("start") Long start, @JsonProperty("end") Long end, @JsonProperty("timestamp") Long timestamp) {
        this.tags = tags == null ? emptyMap() : unmodifiableMap(tags);
        this.start = start;
        this.end = end;
        this.timestamp = timestamp;
    }




}
