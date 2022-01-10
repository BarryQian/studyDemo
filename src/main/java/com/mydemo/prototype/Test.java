package com.mydemo.prototype;

import java.util.Objects;

/**
 * @author qiangang8
 * @date 2021/11/29 20:19
 */
public class Test {
    public static void main(String[] args) {
        ShallowCopyStudent shallowCopyStudent = new ShallowCopyStudent();
        shallowCopyStudent.setScore(98);
        shallowCopyStudent.setId(10);
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("aaa");
        shallowCopyStudent.setPersonInfo(personInfo);

        //非基本值类型为 浅拷贝
        ShallowCopyStudent stu2 = shallowCopyStudent.clone();
        stu2.getPersonInfo().setName("bb"); //同时修改了student和stu2的personinfo
        if (shallowCopyStudent == stu2) {
            System.out.println("is the same object");
        }

        if (Objects.equals(shallowCopyStudent, stu2)) {
            System.out.println("equal");
        }

        System.out.println(shallowCopyStudent);
        System.out.println(stu2);

        System.out.println("-------------------------");
        FirstDeepCopyStudent firstDeepCopyStudent = new FirstDeepCopyStudent();
        firstDeepCopyStudent.setScore(10);
        firstDeepCopyStudent.setPersonInfo(new PersonInfo("cc"));

        FirstDeepCopyStudent firstDeepCopyStudent1 = firstDeepCopyStudent.clone();
        firstDeepCopyStudent1.getPersonInfo().setName("ccff");

        System.out.println(firstDeepCopyStudent);
        System.out.println(firstDeepCopyStudent1);

        String s = Objects.toString(null);
        System.out.println(s);

    }
}
