package com.mydemo.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-06 15:44
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BuilderTest {
    @Test
    public void test() {
        Director director = new Director();

        MacComputerBuilder macComputerBuilder = new MacComputerBuilder("I5", "4G");

        ThinkPadComputerBuilder thinkPadComputerBuilder = new ThinkPadComputerBuilder("I7", "8G");

        director.build(macComputerBuilder);
        director.build(thinkPadComputerBuilder);

        Computer macComputer = macComputerBuilder.getComputer();
        Computer thinkPad = thinkPadComputerBuilder.getComputer();

        System.out.println(macComputer);
        System.out.println(thinkPad);

    }
}
