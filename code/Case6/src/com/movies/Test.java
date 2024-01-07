package com.movies;

import java.util.Scanner;

/**
 * 电影存储，获取
 */
public class Test {
    public static void main(String[] args) {
        // 1. 设计一个存储电影数据的实体类
        // 2. 设计一个操作电影数据的方法类
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水门桥",22,7,"徐克","吴京","12w人想看");
        movies[1] = new Movie(2,"出拳吧",33,5,"唐小白","天宇","11w人想看");
        movies[2] = new Movie(3,"月球陨落",14,8,"索兰","贝瑞","17.9w人想看");
        movies[3] = new Movie(4,"一点就到家",55.7,9,"宇红可","刘昊然","10.8w人想看");

        MovieOperate mo = new MovieOperate(movies);
        // mo.getAllMovieInfo(); // 获取所有的电影信息
        // mo.getMovieInfo(3); // 根据指定id获取电影信息
        // 根据手动输入id查询数据
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=>按数字1获取所有的电影信息");
            System.out.println("=>按数字2获取获取指定电影信息");
            int temp = sc.nextInt();
            switch (temp){
                case 1:
                    mo.getAllMovieInfo(); // 获取所有的电影信息
                    break;
                case 2:
                    System.out.println("请输入需要查询的电影id");
                    int id = sc.nextInt();
                    mo.getMovieInfo(id); // 根据指定id获取电影信息
                    break;
                default:
                    System.out.println("请按照说明输入正确的指令");
            }
        }

    }
}
