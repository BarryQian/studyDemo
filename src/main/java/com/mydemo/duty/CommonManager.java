package com.mydemo.duty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-13 14:00
 **/
@NoArgsConstructor
public class CommonManager extends Base implements Handler{
    public CommonManager(String name, Handler h) {
        super();
        this.name = name;
        this.handler = h;
    }
    @Override
    public boolean handleRequest(Request request) {

        if (Objects.equals(request.getType(), RequestType.QINGJIA) && request.getNum() <= Level.COMMONMANAGER.getDays()) {
            System.out.println(name + "," + Level.COMMONMANAGER.getDesc() + "deal:" + request.getContext() + request.getNum());
            return true;

        }
        return handler.handleRequest(request);
    }
}
