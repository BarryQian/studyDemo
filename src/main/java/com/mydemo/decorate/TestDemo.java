package com.mydemo.decorate;

import com.mydemo.decorate.component.imp.DressSuit;
import com.mydemo.decorate.component.imp.ShoesSuit;
import com.mydemo.decorate.component.imp.TshirtSuit;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-04-20 21:11
 **/
@Component
public class TestDemo {
    @Resource
    private DressSuit dressSuit;
    @Resource
    private ShoesSuit shoesSuit;
    @Resource
    private TshirtSuit tshirtSuit;

    public void test() {
        Customer xiaoming = new Customer();
        xiaoming.setName("xiaoming");
        dressSuit.dressUp(xiaoming);
        tshirtSuit.dressUp(xiaoming);
        shoesSuit.dressUp(xiaoming);
        System.out.println(xiaoming.dressUp(null));
    }
}
