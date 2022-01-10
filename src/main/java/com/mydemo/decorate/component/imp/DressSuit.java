package com.mydemo.decorate.component.imp;

import com.mydemo.decorate.Customer;
import com.mydemo.decorate.FunctionComponent;
import org.springframework.stereotype.Component;
import java.util.Objects;
import com.mydemo.decorate.component.DressComponent;

/**
 * @description:穿西装
 * @author:qiangang8
 * @date:2021-04-20 20:40
 **/
@Component
public class DressSuit implements DressComponent {
    private Customer customer;
    @Override
    public String dressUp(FunctionComponent component) {
        if (Objects.isNull(component)) {
            return null;
        }
        if (!(component instanceof Customer)) {
            return null;
        }
        customer = (Customer)component;
        customer.getClothes().add("suit");
        return "suit";
    }
}
