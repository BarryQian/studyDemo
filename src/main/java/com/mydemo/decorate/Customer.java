package com.mydemo.decorate;

import com.alibaba.fastjson.JSON;
import com.mydemo.decorate.FunctionComponent;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:客户实体
 * @author:qiangang8
 * @date:2021-04-20 20:34
 **/
@Data
public class Customer implements FunctionComponent {
    /**
     * 服装
     */
    private List<String> clothes = new ArrayList<>();
    private String name;

    @Override
    public String dressUp(FunctionComponent component) {
        String rst = name + JSON.toJSONString(clothes);
        return JSON.toJSONString(rst);
    }
}
