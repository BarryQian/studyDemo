package com.mydemo.observer.listeners;

import java.io.File;

/**
 * @description: 收到通知后发送邮件
 * @author:qiangang8
 * @date:2021-05-11 20:04
 **/
public class EmailNotificationListener implements EventListener{
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
