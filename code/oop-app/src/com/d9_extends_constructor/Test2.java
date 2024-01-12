package com.d9_extends_constructor;

/**
 * 子类为什么要调用父类的构造器？
 * 再调用子类的时候，给子类有参数构造器赋值，因为多个变量被拆成了多个类，每次就需要先去调用父类，给父赋值，再来调用子类进行操作
 */
public class Test2 {
    public static void main(String[] args) {
        Student s = new Student("张三",'男',"Java");
        String s1 = s.getSkill();
        String s2 = s.getName();
        char s3 = s.getSex();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class Student extends People{
    private String skill;

    public Student(String skill) {
        this.skill = skill;
    }

    // 这里直接通过调用super去执行父类有参数构造器给父类赋值
    public Student(String name, char sex, String skill) {
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class People{
    private String name;
    private char sex;

    public People() {
    }

    public People(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}