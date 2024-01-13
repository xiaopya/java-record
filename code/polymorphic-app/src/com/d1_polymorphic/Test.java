package com.d1_polymorphic;

/**
 * 多态
 */
public class Test {
    public static void main(String[] args) {
        People s = new Teacher();
        s.run();
        // s.runTest();

        // 这个方法在People里面是没有的不可以调用，如果就是想用，可以强制转换类型去使用
        // 通过判断上面的类型是什么，再去转换对应的类型
        if(s instanceof Student){
            Student s1 = (Student) s;
            s1.runTest();
        }else{
            Teacher s1 = (Teacher) s;
            s1.run1();
        }


        People t = new Teacher();
        t.run();
    }
}
