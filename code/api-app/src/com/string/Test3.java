package com.string;

/**
 * String使用事项
 *
 * String 定义的字符串，是无法更改的，每次拼接或者修改字符串实际上都是在字符串常亮池中存下来，修改后的数据放到堆中，String定义的变量就会指向一个新的地址
 * 定义俩个双引号的字符串，他们的地址都指向同一个，因为字符串的值是无法更改的，java为了优化，把相同的值合并成一个都存在字符串常亮池中
 */
public class Test3 {
    public static void main(String[] args) {
        // 因为俩个字符串相同，会被合并一起存到字符串常量池中，所以他们的地址是一样的
        String s1 = "你好";
        String s2 = "你好";
        System.out.println(s1 == s2); // true

        System.out.println("-----------------------------");

        // 每new一个 都会在堆中创建一个新的对象，他们都指向一个不同的地址
        char[] ch = {'a','b','c'};
        String s3 = new String(ch);
        String s4 = new String(ch);
        System.out.println(s3 == s4); // false

        System.out.println("-----------------------------");

        // 例子：第一个会创建几个对象，第二个会创建几个对象
        String ss1 = new String("abc"); // 他会创建2个对象，一个在字符串常量池中，一个在堆中，但是ss1指向的是堆中的地址
        String ss2 = "abc"; // 他不会创建对象，因为上面已经在常量池中创建了一个，他们的值相同，所以他们共享一份数据，但是他指向的是常量池中的那个对象
        System.out.println(ss1 == ss2); // false

        String ss3 = "abc"; // 放在常量池中
        String ss4 = "ab";  // 放在常量池中
        String ss5 = ss3 + "c"; // 这里是在运算，只要是运算就不会放进常量池里面，是放在堆里面的
        System.out.println(ss3 == ss5); // fasle

        String ss6 = "abc"; // 放在常量池中
        // 那为什么上面的ss5 ↑ 运算是放在堆里面呢，因为在编译的时候，看到ss3，他只是认为他是个符号，只有执行程序的时候，再去找到ss3这个指向"abc",才回去计算这个。
        String ss7 = "a" + "b" + "c"; // 这里其实是abc，这是因为java存在编译优化机制，这里的字符串a，b，c 都是确定好的，他会直接编译成"abc",可以在编译文件class中看到
        System.out.println(ss6 == ss7); // true
    }
}
