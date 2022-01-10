package com.mydemo.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @description:具体产品
 * @author:qiangang8
 * @date:2021-05-06 15:33
 **/
@Setter
@Getter
public class Computer {
    private String cpu;//必填
    private String ram;//必填
    private int usbCount;
    private String keyBoard;
    private String display;

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyBoard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
