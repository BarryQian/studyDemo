package com.mydemo.prototype;

import lombok.Data;

/**
 * 深拷贝-1：使用clone方法 (需要实现Cloneable接口)
 * @author qiangang8
 * @date 2021/11/29 20:10
 */
@Data
public class FirstDeepCopyStudent implements Cloneable{
    private int id;
    private int score;
    private PersonInfo personInfo;

    // 复制新对象并返回
    @Override
    public FirstDeepCopyStudent clone() {

        try {
            FirstDeepCopyStudent student = (FirstDeepCopyStudent) super.clone();
            PersonInfo p = personInfo.clone();
            student.setPersonInfo(p);
            return student;
        }catch (Exception e) {
            return null;
        }
    }
}
