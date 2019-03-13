package com.gupao.prototype.deep;

import java.io.Serializable;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class Age implements Serializable {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Age(int age){
        this.age = age;
    }
}
