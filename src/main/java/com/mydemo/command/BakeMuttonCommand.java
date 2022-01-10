package com.mydemo.command;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-12 14:55
 **/
public class BakeMuttonCommand extends Command{
    public BakeMuttonCommand(Babucuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        this.receiver.bakeMutton();
    }
}
