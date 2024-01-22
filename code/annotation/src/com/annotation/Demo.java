package com.annotation;

/**
 * @projectName: java学习记录
 * @package: com.annotation
 * @className: Demo
 * @author: cyl
 * @description: TODO 注解，学到框架再回来看
 * @date: 2024/1/22 21:32
 * @version: 1.0
 */
@MyTest2(value = "蜘蛛" ,aaa = 99.5,bbb = {"至尊宝","紫霞"})
public class Demo {
    @MyTest2(value = "蜘蛛1" ,aaa = 55,bbb = {"至尊宝1","紫霞1"})
    public void test1(){

    }
}
