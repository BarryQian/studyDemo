package com.mydemo.command;

/**
 * @description:  抽象命令
 * @author:qiangang8
 * @date:2021-05-12 14:51
 **/
public abstract class Command {

    protected Babucuer receiver;

    public Command(Babucuer receiver) {
        this.receiver = receiver;
    }

    public void executeCommand(){}
}
