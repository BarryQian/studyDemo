package com.mydemo.builder;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-06 15:36
 **/
public class MacComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyBoard() {
        computer.setKeyBoard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}
