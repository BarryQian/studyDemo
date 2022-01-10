package com.mydemo.duty;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-13 14:31
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class DutyTest {
    @Resource
    private DutyProvider provider;

    @Test
    public void handleTest() {
        Request request = new Request();
        request.setContext("小汪请假");
        request.setNum(4);
        request.setType(RequestType.QINGJIA);

        provider.handle(request);


        request.setNum(10);
        provider.handle(request);

        request.setNum(15);
        provider.handle(request);

        request = new Request();
        request.setContext("小刘加薪");
        request.setNum(400);
        request.setType(RequestType.JIAXIN);

        provider.handle(request);


        request.setNum(600);
        provider.handle(request);

        request.setNum(1100);
        provider.handle(request);

    }
}
