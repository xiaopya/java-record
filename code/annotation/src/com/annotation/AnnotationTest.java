package com.annotation;

import org.junit.Test;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @projectName: java学习记录
 * @package: com.annotation
 * @className: AnnotationTest
 * @author: cyl
 * @description: TODO 注解
 * @date: 2024/1/22 21:12
 * @version: 1.0
 */
public class AnnotationTest {
    @Test
    public void parseClass(){
        Class c = Demo.class;
        if(c.isAnnotationPresent(MyTest2.class)){
            MyTest2 myTest = (MyTest2) c.getDeclaredAnnotation(MyTest2.class);
            System.out.println(myTest.value());
            System.out.println(myTest.aaa());
            System.out.println(Arrays.toString(myTest.bbb()));
        }
    }

    @Test
    public void parseMethod() throws Exception {
        Class c = Demo.class;
        Method m = c.getDeclaredMethod("test1");
        if(m.isAnnotationPresent(MyTest2.class)){
            MyTest2 myTest = m.getDeclaredAnnotation(MyTest2.class);
            System.out.println(myTest.value());
            System.out.println(myTest.aaa());
            System.out.println(Arrays.toString(myTest.bbb()));
        }
    }
}
