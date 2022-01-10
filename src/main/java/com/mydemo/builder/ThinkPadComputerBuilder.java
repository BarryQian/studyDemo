package com.mydemo.builder;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-06 15:36
 **/
public class ThinkPadComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public ThinkPadComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyBoard() {
        computer.setKeyBoard("tp键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("tp显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
