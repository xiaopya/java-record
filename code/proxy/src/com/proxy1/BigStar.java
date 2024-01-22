package com.proxy1;

/**
 * @projectName: java学习记录
 * @package: com.proxy1
 * @className: BigStar
 * @author: cyl
 * @description: TODO
 * @date: 2024/1/22 22:36
 * @version: 1.0
 */
public class BigStar implements  Star {
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
