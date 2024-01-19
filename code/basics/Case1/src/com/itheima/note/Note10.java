package com.itheima.note;

/**
 * 自增自减运算符
 * 注意事项：++a 和 a++
 * 1. 如果是单独使用前后写法没有任何区别
 * 2. 如果是非单独使用也就是 rs = ++a 或 rs == a++ 这样的话，前者是 a先自增再把值赋给rs，后者是先赋给rs，在自增
 */
public class Note10 {
    public static void main(String[] args) {
//        int a = 10;
//        a++; // a = a + 1;  11
//        ++a; // 12
//        System.out.println(a); //12
//
//
//        a--; // a = a - 1;  11
//        --a; // 10
//        System.out.println(a); // 10
//
//
//        // 注意事项
//        int i = 10;
//        int rs = ++i;
//        System.out.println(rs); //11
//        System.out.println(i); //11
//        int rs1 = i++;
//        System.out.println(rs1); // 11
//        System.out.println(i); //12


        // 案例
        int m = 5;
        int n = 3;
        //           6  -  5  + 5 - 4 + 4 + 3
        int result = ++m - --m + m-- - ++n + n-- + 3;
        System.out.println(result); // 9
        System.out.println(m); // 4
        System.out.println(n); // 3
    }
}
