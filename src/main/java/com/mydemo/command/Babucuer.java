package com.mydemo.command;

/**
 * @description:烤肉师--饿汉式
 * @author:qiangang8
 * @date:2021-05-12 14:50
 **/
public class Babucuer {

    private static  Babucuer instance = new Babucuer();

    private Babucuer() {}

    public static Babucuer getInstance() {
        return instance;
    }

    public void bakeMutton() {
        System.out.println(Thread.currentThread().getId() + ":" + System.currentTimeMillis() + CommandEnum.MUTTON.getDesc() + "好了");
    }


    public void bakeChicken() {
        System.out.println(Thread.currentThread().getId() + ":" + System.currentTimeMillis() + CommandEnum.CKICKEN.getDesc() + "好了");
    }
}
