package com.mydemo.observer.listeners;

import java.io.File;

/**
 * @description: 通用观察者接口
 * @author:qiangang8
 * @date:2021-05-11 20:03
 **/
public interface EventListener {
    void update(String eventType, File file);
}
