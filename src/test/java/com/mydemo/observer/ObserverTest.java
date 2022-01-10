package com.mydemo.observer;

import com.mydemo.observer.editor.Editor;
import com.mydemo.observer.listeners.EmailNotificationListener;
import com.mydemo.observer.listeners.LogOpenListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-06 16:50
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ObserverTest {

    @Test
    public void test() {

        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("../file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("test@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test2() {
        Date date1 = new Date(System.currentTimeMillis() + 1000*60*60*24*2);
        Date date2 = new Date(System.currentTimeMillis() + 1000*60*60*25);
        String s = calculateCountdown(date2, date1);
        System.out.println(s);
    }
    private String calculateCountdown(Date activityEndTime, Date taskEndTime) {
        DateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss");

        Date shortEndTime = activityEndTime.after(taskEndTime) ? taskEndTime : activityEndTime;
        Date now = new Date();
        // 如果结束时间在当时时间之前
        if (shortEndTime.before(now)) {
            return "00:00:00";
        }
        long countDownTime = shortEndTime.getTime() - now.getTime();

        long sec = (countDownTime / 1000) % 60;
        long minu = ((countDownTime / 1000) / 60) % 60;
        long h = (((countDownTime / 1000) / 60) / 60) % 60;

        return "\"" + h + ":" + minu + ":" + sec + "\"";

    }
    @Test
    public void test3() {
        BigDecimal b1 = new BigDecimal(3);
        BigDecimal b2 = new BigDecimal(10.2);
        BigDecimal b3 = b2.add(b1);
        System.out.println(b3);
    }
    @Test
    public void test4() {
        List<Editor>  list = null;
        List<File> collect = list.stream().map(l -> l.getFile()).collect(Collectors.toList());
    }
}
