package com.mydemo.decorate;

/**
 * @description:功能组件接口
 * @author:qiangang8
 * @date:2021-04-20 20:35
 **/
public interface FunctionComponent {
    /**
     * 服饰装扮功能
     * @return
     */
    String dressUp(FunctionComponent component);
}
