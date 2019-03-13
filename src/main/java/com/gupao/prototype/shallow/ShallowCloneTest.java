package com.gupao.prototype.shallow;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class ShallowCloneTest {


    public static void main(String[] args) {
        Age age = new Age(20);
        Student student1 = new Student();
        student1.setAge(age);
        student1.setName("咕泡");
        student1.setSex("女");

        Student student2 = student1.clone();

        //运行结果显示clone的两个对象地址不同，但是对象里面的age对象的地址还是一样的。
        // 改变了student2里面的age对象的值，student1里面的值也改变了。
        System.out.println(student1==student2);
        System.out.println(student1.getAge());
        System.out.println(student2.getAge());
        System.out.println(student1.getAge()==student2.getAge());

        Age age2 = student2.getAge();
        age2.setAge(19);
        System.out.println(student1.getAge()==student2.getAge());
    }
}
