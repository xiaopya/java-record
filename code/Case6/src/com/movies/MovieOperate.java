package com.movies;

public class MovieOperate {
    private Movie[] movies;

    public MovieOperate(Movie[] movies){
        this.movies = movies;
    }

    /**
     * 获取所有的电影信息
     */
    public void getAllMovieInfo(){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            getInfo(m);
        }
    }

    /**
     * 根据指定电影id获取对应数据
     * @param id int
     */
    public void getMovieInfo(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId() == id){
                getInfo(m);
                return;
            }
        }
        System.out.println("未能搜索到相关数据,请输入正确的id");
    }

    private void getInfo(Movie m){
        System.out.println("===获取的电影信息如下：===");
        System.out.println("标识: " + m.getId());
        System.out.println("名称: " + m.getName());
        System.out.println("评分: " + m.getScore());
        System.out.println("价格: " + m.getPrice());
        System.out.println("导演: " + m.getDirector());
        System.out.println("演员: " + m.getActor());
        System.out.println("其他信息: " + m.getDescription());
    }
}
