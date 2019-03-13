package com.gupao.prototype.deep;


/**
 * Created by xuhuan on 2019/3/13.
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        Age age = new Age(20);
        Student student1 = new Student();
        student1.setAge(age);
        student1.setName("咕泡");
        student1.setSex("女");

        Student student2 = student1.clone();

        //深度clone之后，student对象和内部的引用都不同了
        System.out.println(student1==student2);
        System.out.println(student1.getAge());
        System.out.println(student2.getAge());
        System.out.println(student1.getAge()==student2.getAge());

        Age age2 = student2.getAge();
        age2.setAge(19);
        System.out.println(student1.getAge()==student2.getAge());
    }
}
