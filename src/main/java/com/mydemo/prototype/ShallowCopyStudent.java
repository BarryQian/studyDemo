package com.mydemo.prototype;

import lombok.Data;

/**
 * @author qiangang8
 * @date 2021/11/29 20:10
 */
@Data
public class ShallowCopyStudent implements Cloneable{
    private int id;
    private int score;
    private PersonInfo personInfo;

    // 复制新对象并返回: 浅拷贝
    @Override
    public ShallowCopyStudent clone() {

        try {
            return (ShallowCopyStudent)super.clone();

        }catch (Exception e) {
            return null;
        }
    }
}
