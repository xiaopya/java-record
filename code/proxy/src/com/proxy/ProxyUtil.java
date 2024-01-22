package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @projectName: java学习记录
 * @package: com.proxy
 * @className: ProxyUtil
 * @author: cyl
 * @description: TODO 代理
 * @date: 2024/1/22 22:19
 * @version: 1.0
 */
public class ProxyUtil  {
    public static Star createProxy(BigStar bigStar){
        /*
            newProxyInstance(ClassLoader loader,
                     Class<?>[] interfaces,
                     InvocationHandler h) {
            参数1: 用于指指定一个类加载器
            参数2: 用于生成的代理张什么样子，也就是有哪些方法
            参数3: 用于生成的代理的实现类，也就是实现哪些方法
         */
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")){
                    System.out.println("准备好唱歌的器材");
                }else if(method.getName().equals("dance")){
                    System.out.println("准备好跳舞的器材");
                }
                return method.invoke(bigStar,args);
            }
        });
        return starProxy;
    }
}
