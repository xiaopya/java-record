package com.d1_inner_class;

public class WithOUt {
    private String name;
    private int age;

    public class Inner{
        private char sex;

        public void print(){
            System.out.println(this.sex);
            System.out.println(WithOUt.this.age);
        }
    }
}
