package com.object_stream;

import java.io.Serializable;

/**
 * @projectName: java学习记录
 * @package: com.object_stream
 * @className: User
 * @author: cyl
 * @description: TODO 需要被存储到文件中的对象
 * @date: 2024/1/20 23:16
 * @version: 1.0
 */
public class User implements Serializable {
    private String name;
    private int age;
    private int sex;
    // transient 这个修饰符 表示当前password不参与序列化
    private transient String password;

    public User() {
    }



    public User(String name, int age, int sex, String password) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", password='" + password + '\'' +
                '}';
    }
}
