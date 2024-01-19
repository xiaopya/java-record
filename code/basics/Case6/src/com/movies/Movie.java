package com.movies;

/**
 * 存储电影信息的实体类
 */
public class Movie {
    private int id;
    /* 名称 */
    private String name;
    /* 价格 */
    private double price;
    /* 评分 */
    private double score;
    /* 导演 */
    private String director;
    /* 演员 */
    private String actor;
    /* 其他信息 */
    private String description;

    public Movie() {
    }

    public Movie(int id, String name, double price, double score, String director, String actor, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.director = director;
        this.actor = actor;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
