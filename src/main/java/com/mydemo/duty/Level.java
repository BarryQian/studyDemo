package com.mydemo.duty;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:职级
 * @author:qiangang8
 * @date:2021-05-13 13:51
 **/
@AllArgsConstructor
@Getter
public enum Level {
    COMMONMANAGER(1,5,0,"经理"),
    MAJORDOMO(2,10, 500, "总监"),
    GENERALMANAGER(3, 15, 1000, "总经理");

    private int code;
    private int days;
    private int money;
    private String desc;
}
