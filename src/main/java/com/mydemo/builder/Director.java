package com.mydemo.builder;

/**
 * @description:指挥者
 * @author:qiangang8
 * @date:2021-05-06 15:33
 **/
public class Director {
    public void build(ComputerBuilder builder) {
        builder.setUsbCount();
        builder.setKeyBoard();
        builder.setDisplay();
    }
}
