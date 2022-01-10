package com.mydemo.observer.listeners;

import java.io.File;

/**
 * @description:收到通知后在日志中记录一条消息
 * @author:qiangang8
 * @date:2021-05-11 20:04
 **/
public class LogOpenListener implements EventListener{
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
