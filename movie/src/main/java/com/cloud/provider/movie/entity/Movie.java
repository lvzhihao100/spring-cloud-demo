package com.cloud.provider.movie.entity;

/**
 * @author 吕志豪
 * @date 17-12-12  上午8:41
 * Github :https://github.com/lvzhihao100
 * E-Mail：1030753080@qq.com
 * 简书 :http://www.jianshu.com/u/6e525b929aac
 * 说明 :
 */
public class Movie {
    String name;
    String time;

    public Movie(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public String getTime() {
        return time;
    }

    public Movie setTime(String time) {
        this.time = time;
        return this;
    }
}
