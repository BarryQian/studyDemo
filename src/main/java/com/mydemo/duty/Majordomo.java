package com.mydemo.duty;

import lombok.AllArgsConstructor;

import java.util.Objects;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-13 14:12
 **/
@AllArgsConstructor
public class Majordomo extends Base implements Handler{
    public Majordomo(String name, Handler h) {
        super();
        this.name = name;
        this.handler = h;
    }
    @Override
    public boolean handleRequest(Request request) {
        if (Objects.equals(request.getType(), RequestType.QINGJIA) && request.getNum() <= Level.MAJORDOMO.getDays()) {
            System.out.println(name + "," + Level.MAJORDOMO.getDesc() + "deal:" + request.getContext() + request.getNum());
            return true;
        }
        if (Objects.equals(request.getType(), RequestType.JIAXIN) && request.getNum() <= Level.MAJORDOMO.getMoney()) {
            System.out.println(name + "," + Level.MAJORDOMO.getDesc() + "deal:" + request.getContext() + request.getNum());
            return true;
        }
        return handler.handleRequest(request);
    }
}
