package com.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @projectName: java学习记录
 * @package: com.proxy1
 * @className: ProxyUtil
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/22 22:38
 * @version: 1.0
 */
public class ProxyUtil {
    public static Star creatProxy(BigStar bigStar){
        /*
        ce(ClassLoader loader,
              Class<?>[] interfaces,
              InvocationHandler h) {
         */
        return (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")){
                    System.out.println("唱歌了");
                }else if(method.getName().equals("dance")){
                    System.out.println("跳舞了");
                }
                return method.invoke(bigStar,args);
            }
        });
    }
}
