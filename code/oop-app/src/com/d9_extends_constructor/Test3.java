package com.d9_extends_constructor;

/**
 * this: 通过this去掉用兄弟构造器
 */
public class Test3 {
    public static void main(String[] args) {
        Case c = new Case("张三","Java","家里蹲大学");
        // 我想默认传入前俩个参数，不填写学校，但是默认给他一个 野鸡大学。
        Case c1 = new Case("历史","javascript");
        System.out.println(c1.getName());
        System.out.println(c1.getSchool());
        System.out.println(c1.getSkill());
    }
}
class Case{
    private String name;
    private String skill;
    private String school;

    public Case() {
    }

    public Case(String name,String skill){
        // 这里的this是调用的下面的有参数构造器，
        this(name,skill,"野鸡大学");
    }

    public Case(String name, String skill, String school) {
        this.name = name;
        this.skill = skill;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}