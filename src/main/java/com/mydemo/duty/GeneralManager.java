package com.mydemo.duty;

import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-13 14:18
 **/

@NoArgsConstructor
public class GeneralManager extends Base implements Handler{
    public GeneralManager(String name, Handler h) {
        super();
        this.name = name;
        this.handler = h;
    }

    @Override
    public boolean handleRequest(Request request) {
        if (Objects.equals(request.getType(), RequestType.QINGJIA) && request.getNum() <= Level.GENERALMANAGER.getDays()) {
            System.out.println(name + "," + Level.GENERALMANAGER.getDesc() + "deal:" + request.getContext()  + request.getNum());
            return true;
        }
        if (Objects.equals(request.getType(), RequestType.JIAXIN) && request.getNum() <= Level.GENERALMANAGER.getMoney()) {
            System.out.println(name + "," + Level.GENERALMANAGER.getDesc() + "deal:" + request.getContext() + request.getNum());
            return true;

        }
        System.out.println(name + "," + Level.GENERALMANAGER.getDesc() + "deal:" + request.getContext() + request.getNum() + ": no way");
        return true;
    }
}
