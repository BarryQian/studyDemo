package com.mydemo.command;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-12 15:08
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class DemoTest {

    @Test
    public void commandTest() {



        ExecutorService pool = Executors.newFixedThreadPool(5);
        for ( int i = 0; i < 10; i++) {

            pool.execute(() -> Waiter.getInstance().setOrder(CommandEnum.MUTTON.getCode()));
            pool.execute(() -> Waiter.getInstance().setOrder(CommandEnum.CKICKEN.getCode()));
        }

    }
}
