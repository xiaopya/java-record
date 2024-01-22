package com.proxy;

/**
 * @projectName: java学习记录
 * @package: com.proxy
 * @className: BigStar
 * @author: cyl
 * @description: TODO 代理
 * @date: 2024/1/22 22:04
 * @version: 1.0
 */
public class BigStar implements Star {
    private String name;

    public BigStar(String name){
        this.name = name;
    }
    @Override
    public void sing(){
        System.out.println(name + "be singing");
    }
    @Override
    public void dance(){
        System.out.println(name + "be dance");
    }
}
