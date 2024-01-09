package com.pkg;

import com.pkg.DemoPkg.Test;
import com.pkg.DemoPkg.TestDemo1;

import java.util.Scanner;

/**
 * 包的介绍和注意事项
 */
public class Test1 {
    public static void main(String[] args) {
        // 1.在自己程序中调用其他包下的程序的注意事项·如果当前程序中，要调用自己所在包下的其他程序，可以直接调用。（同一个包下的类，互相可以直接调用）
        Pkg1 p1 = new Pkg1(); // 可以直接调用，上面不需要导入当前包
        p1.print();

        // 2.如果当前程序中，要调用其他包下的程序，则必须在当前程序中导包，才可以访问！导包格式：import包名.类名；
        Test t1 = new Test(); // 因为调用的包在其他文件夹下面，这个时候就需要导入 import com.pkg.DemoPkg.Test;
        t1.print();

        // 3.如果当前程序中，要调用Java提供的程序，也需要先导包才可以使用；但是Java.lang包下的程序是不需要我们导包的，可以直接使用
        Scanner sc = new Scanner(System.in); // 也是需要导入包
        String str = "我是不需要进过导入就能直接用"; // String是在Java.lang的包下面，这个包会被直接使用，不需要在导入

        // 4.如果当前程序中，要调用多个不同包下的程序，而这些程序名正好一样，此时默认只能导入一个程序，另一个程序必须带包名访问，
        TestDemo1 td1 = new TestDemo1();
        td1.print();
        com.pkg.DemoPkg1.TestDemo1 td2 = new com.pkg.DemoPkg1.TestDemo1(); // 不同文件夹下面，有相同文件，直接导入一个，第二个就需要用整个文件夹作为名称进行使用
        td2.print();
    }
}
