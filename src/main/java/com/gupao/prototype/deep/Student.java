package com.gupao.prototype.deep;

import java.io.*;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class Student implements Cloneable,Serializable {

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
        return this.deepClone();
    }

    private Student deepClone() {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student copy = (Student)ois.readObject();

            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
