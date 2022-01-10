package com.mydemo.decorate;


/**
 * @description:
 * @author:qiangang8
 * @date:2020-11-25 22:27
 **/
import com.mydemo.decorate.TestDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class DecoreteTest {
    @Resource
    private TestDemo testDemo;

    @Test
    public void testDress() {
        testDemo.test();
    }
}
