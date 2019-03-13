package com.gupao.prototype.shallow;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class Student implements Cloneable {

    private String name;
    private String sex;
    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public  Student(){

    }

    @Override
    protected Student clone() {
        Student student = new Student();
        student.setName(this.name);
        student.setSex(this.sex);
        student.setAge(this.age);
        return student;
    }
}
