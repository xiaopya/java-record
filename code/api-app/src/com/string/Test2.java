package com.string;

/**
 * String
 * public int length()                                                      获取字符串的长度返回（就是字符个数）
 * public char charAt(int index)                                            获取某个索引位置处的字符返回
 * public char[] toCharArray()                                              将当前字符串转换成字符数组返回
 * public boolean equals(Object an0bject)                                   判断当前字符串与另一个字符串的内容一样，一样返回true
 * public boolean equalsIgnoreCase(String anotherString)                    判断当前字符串与另一个字符串的内容是否一样（忽略大小写）
 * public String substring(int beginIndex, int endIndex)                    根据开始和结束索引进行截取，得到新的字符串（包前不包后）
 * public String substring(int beginIndex)                                  从传入的索引处截取，截取到末尾，得到新的字符串返回
 * public String replace(CharSequence target, CharSequence replacement)     使用新值，将字符串中的旧值替换，得到新的字符串
 * public boolean contains(CharSequence s)                                  判断字符串中是否包含了某个字符串
 * public boolean startsWith(String prefix)                                 判断字符串是否以某个字符串内容开头，开头返回true，反之
 * public String[] split(String regex)                                      把字符串按照某个字符串内容分割，并返回字符串数组回来
 *
 */
public class Test2 {
    public static void main(String[] args) {
        // 获取字符串长度
        String s1 = "获取字符串长度";
        int length = s1.length();
        System.out.println(length);

        System.out.println("----------------------------------------------");

        // 根据索引拿到对于的字符串
        String s2 = "我是一串文字";
        char ch = s2.charAt(1); // 是
        System.out.println(ch);
        // 遍历字符串拿到每个字符
        for (int i = 0; i < s2.length(); i++) {
            System.out.println(s2.charAt(i));
        }

        System.out.println("----------------------------------------------");

        // 将字符串转成字符数组
        String s3 = "我想转成数组";
        char[] ch1 = s3.toCharArray();
        System.out.println(ch1);

        System.out.println("----------------------------------------------");

        // 判断当前字符串与另一个字符串是否一样
        String s4 = "13FaATy";
        String s5 = "13FaATy";
        boolean b1 = s4.equals(s5);
        System.out.println(b1);
        // 判断当前字符串与另一个字符串是否一样（不区分大小写）
        String s6 = "13FaATy";
        String s7 = "13faAty";
        boolean b2 = s6.equalsIgnoreCase(s7);
        System.out.println(b2);

        System.out.println("----------------------------------------------");

        // 字符串截取  [0,3)
        String s8 = "我想被截取";
        String s9 = s8.substring(0,3); // 我想被 (包前不包后)
        System.out.println(s9);
        // 只传入一个参数的话，就会从指定索引开始一直截取到最后
        String s10 = s8.substring(1);
        System.out.println(s10); // 想被截取

        System.out.println("----------------------------------------------");

        // 字符串替换
        String s11 = "你真的是个好人啊";
        String s12 = s11.replace("好人","**");
        System.out.println(s12); // 你真的是个**啊

        System.out.println("----------------------------------------------");

        // 判断字符串中是否包含某个字符串
        String s13 = "我被包含了吗";
        boolean b3 = s13.contains("包含"); // 这个是精准搜索
        System.out.println(b3);

        System.out.println("----------------------------------------------");

        // 判断字符串是否是某个字符串开头
        String s14 = "法外狂徒";
        boolean b4 = s14.startsWith("法外");
        System.out.println(b4);

        System.out.println("----------------------------------------------");

        // 把字符串按照某个字符串进行分割，返回字符串数组
        String s15 = "小明,小红,杨幂,迪丽热巴,小朋友";
        String[] s16 = s15.split(",");
        for (int i = 0; i < s16.length; i++) {
            System.out.println(s16[i]);
        }
    }
}
