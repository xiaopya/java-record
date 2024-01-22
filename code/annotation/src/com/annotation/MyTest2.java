package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author liziyuan
 */
@Target({ElementType.TYPE,ElementType.METHOD}) // 注解只能用在类和方法上面：ElementType.TYPE,ElementType.METHOD
@Retention(RetentionPolicy.RUNTIME) // 申明注解保留的时间，一直保留到运行阶段：RetentionPolicy.RUNTIME
public @interface MyTest2 {
    String value();
    double aaa() default 100;
    String[] bbb();
}
