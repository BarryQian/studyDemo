package com.mydemo.singleton;

/**
 * @description: 饿汉式，在类初始化时，已经自行实例化
 * @author:qiangang8
 * @date:2021-05-12 14:00
 **/
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
            return instance;
    }
}
