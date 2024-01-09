package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 食品操作类
 */
public class FoodOperate {
    private ArrayList<Food> foodList = new ArrayList<>();

    /**
     * 上架菜品
     */
    public void addFood(){
        Scanner sc = new Scanner(System.in);
        Food f = new Food();

        System.out.println("请输入要上架的菜品名称:");
        String name = sc.next();
        f.setName(name);

        System.out.println("请输入菜品价格:");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请输入菜品的描述信息:");
        String desc = sc.next();
        f.setDescription(desc);

        foodList.add(f);
    }

    /**
     * 根据指定名称去修改菜谱
     */
    public void editFood(String n){
        if(foodList.size() == 0){
            System.out.println("没有可修改的菜谱");
            return;
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            String name = f.getName();
            // 只要name中包含 就输出
            System.out.println(name + "---" + n);
            if(name.equals(n)){
                System.out.println("请输入修改后的名称：");
                String name1 = sc.next();
                f.setName(name1);

                System.out.println("请输入修改后的价格：");
                double price1 = sc.nextDouble();
                f.setPrice(price1);

                System.out.println("请输入修改后的描述：");
                String desc1 = sc.next();
                f.setDescription(desc1);

                System.out.println("修改完成");
            }else{
                System.out.println("未找到该菜名");
            }
        }
    }

    public void checkFood(String n){
        // 按照给出的name 去 菜品中查找相同的并输出，用模糊查询
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            String name = f.getName();
            // 只要name中包含 就输出
            if(name.contains(n)){
                printFood(f);
            }else{
                System.out.println("未找到该菜名");
            }
        }
    }

    /**
     * 查看所有菜单
     */
    public void checkAllFood(){
        if(foodList.size() == 0){
            System.out.println("一个菜品都没有哦，请先添加菜单哦");
            return;
        }

        // 按照给出的name 去 菜品中查找相同的并输出，用模糊查询
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            printFood(f);
        }
    }

    public void printFood(Food f){
        System.out.println("菜品名称：" + f.getName());
        System.out.println("菜品价格：" + f.getPrice());
        System.out.println("菜品描述：" + f.getDescription());
        System.out.println("-----------------------------");
    }

    /**
     * 启动程序
     */
    public void start(){
        while (true) {
            System.out.println("***********************");
            System.out.println("==按照下面介绍去操作==");
            System.out.println("==输入0退出菜单==");
            System.out.println("==输入1添加菜单==");
            System.out.println("==输入2查看指定名称的菜单==");
            System.out.println("==输入3查看所有添加菜单==");
            System.out.println("==输入4修改指定菜谱==");
            System.out.println("***********************");

            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "0":
                    System.out.println("下次再来哦...");
                    return;
                case "1":
                    addFood();
                    break;
                case "2":
                    System.out.println("请输入你要查询的菜单名称:");
                    String name1 = sc.next();
                    checkFood(name1);
                    break;
                case "3":
                    checkAllFood();
                    break;
                case "4":
                    System.out.println("请输入你要修改的菜单名称:");
                    String name2 = sc.next();
                    editFood(name2);
                    break;
                default:
                    System.out.println("不按照规定来，你是想造反...");
                    break;
            }
        }
    }
}
