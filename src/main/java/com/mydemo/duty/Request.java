package com.mydemo.duty;

import lombok.Data;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-13 13:48
 **/
@Data
public class Request {

    private RequestType type;
    private Integer num;
    private String context;
}
