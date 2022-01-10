package com.mydemo.duty;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-13 13:50
 **/
@AllArgsConstructor
@Getter
public enum RequestType {
    JIAXIN(1,"加薪"),
    QINGJIA(2,"请假");

    private int code;
    private String desc;
}
