package com.mydemo.prototype;

import lombok.Data;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 深拷贝-2：通过对象的序列化实现 (需要实现Serializable接口) 推荐使用
 * @author qiangang8
 * @date 2021/11/29 20:10
 */
@Data
public class SecondDeepCopyStudent implements Cloneable{
    private int id;
    private int score;
    private PersonInfo personInfo;

    // 复制新对象并返回
    @Override
    public SecondDeepCopyStudent clone() {

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            SecondDeepCopyStudent o = (SecondDeepCopyStudent) ois.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }

    }
}
