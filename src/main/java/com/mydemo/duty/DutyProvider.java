package com.mydemo.duty;

import org.springframework.stereotype.Component;


/**
 * @description:
 * @author:qiangang8
 * @date:2021-05-13 14:20
 **/
@Component
public class DutyProvider {
    public boolean handle(Request request) {
        GeneralManager generalManager = new GeneralManager("王总", null);
        Majordomo majordomo = new Majordomo("李总监", generalManager);
        CommonManager commonManager = new CommonManager("张经理", majordomo);

        return commonManager.handleRequest(request);

    }

}
