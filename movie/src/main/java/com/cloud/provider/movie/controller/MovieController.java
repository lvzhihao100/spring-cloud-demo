package com.cloud.provider.movie.controller;

import com.cloud.provider.movie.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 吕志豪
 * @date 17-12-12  上午8:39
 * Github :https://github.com/lvzhihao100
 * E-Mail：1030753080@qq.com
 * 简书 :http://www.jianshu.com/u/6e525b929aac
 * 说明 :
 */
@RestController
public class MovieController {
    @GetMapping(path = "/movie/{id}")
    public Movie getMovieById(@PathVariable long id) {
        return new Movie("大话西游" + id, "100分钟");
    }
}
