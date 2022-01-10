package com.mydemo.singleton;

/**
 * @description: 懒汉式，用到时才初始化
 * @author:qiangang8
 * @date:2021-05-12 14:00
 **/
public class Singleton {
    private volatile static Singleton instance=null;

    private Singleton() {}

    public static Singleton getInstance() {
            if (null == instance) {
                synchronized (Singleton.class) {
                    if (null == instance) {
                        instance = new Singleton();
                    }
                    return instance;
                }
            }
            return instance;
    }
}
