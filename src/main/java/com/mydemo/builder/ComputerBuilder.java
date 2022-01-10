package com.mydemo.builder;

/**
 * @description:构建者接口
 * @author:qiangang8
 * @date:2021-05-06 15:32
 **/
public interface ComputerBuilder {
    void setUsbCount();
    void setKeyBoard();
    void setDisplay();

    Computer getComputer();
}
