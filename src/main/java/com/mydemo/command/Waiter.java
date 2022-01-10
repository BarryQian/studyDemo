package com.mydemo.command;

import java.util.Objects;

/**
 * @description:服务员--懒汉式
 * @author:qiangang8
 * @date:2021-05-12 14:50
 **/
public class Waiter {
    private  static  Waiter waiter = null;
    private Command command;

    private Waiter() {}

    public static Waiter getInstance() {
        if (null == waiter) {
            synchronized (Waiter.class) {
                if (null == waiter) {
                    System.out.println("waiter init");
                    waiter = new Waiter();
                }
            }
        }
        return waiter;
    }

    public void setOrder(Integer code) {
        Babucuer babucuer = Babucuer.getInstance();

        if (Objects.equals(CommandEnum.CKICKEN.getCode(), code)) {
            this.command =  new BakeMuttonCommand(babucuer);
        }
        if (Objects.equals(CommandEnum.MUTTON.getCode(), code)) {
            this.command = new BakeChickenCommand(babucuer);
        }

        notifyCommand();
    }

    public void notifyCommand() {
        command.executeCommand();
    }
}
