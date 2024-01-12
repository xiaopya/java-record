package com.d7_extends_override;

public class Test {
    public static void main(String[] args) {
        OverrideDemo1 o = new OverrideDemo1(12,"张三");
        o.print();
        o.print(1,2);

        // 打印o对象的时候，会发现打印出来的结果是地址，
        // 每次打印都是默认调用toString();方法的，这样可以用方法重写来实现打印当前对象的内容
        // System.out.println(o.toString());
        System.out.println(o);  // 重写后输出就是：OverrideDemo1{num=12.0, name='张三'}
    }
}
