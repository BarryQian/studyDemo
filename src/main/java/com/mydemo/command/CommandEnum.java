package com.mydemo.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-12 15:10
 **/
@AllArgsConstructor
@Getter
public enum CommandEnum {
    CKICKEN(1,"烤鸡翅"),

    MUTTON(2,"烤羊肉") ;

    private int code;
    private String desc;
}
