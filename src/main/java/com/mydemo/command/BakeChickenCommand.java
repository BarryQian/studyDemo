package com.mydemo.command;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-12 14:58
 **/
public class BakeChickenCommand extends Command{
    public BakeChickenCommand(Babucuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand(){
        this.receiver.bakeChicken();
    }
}
