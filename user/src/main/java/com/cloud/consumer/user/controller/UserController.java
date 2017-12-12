package com.cloud.consumer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 吕志豪
 * @date 17-12-12  上午8:53
 * Github :https://github.com/lvzhihao100
 * E-Mail：1030753080@qq.com
 * 简书 :http://www.jianshu.com/u/6e525b929aac
 * 说明 :
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(path = "/movie/{id}")
    public String getMovieById(@PathVariable long id) {
        return restTemplate.getForObject("http://provider-movie/movie/" + id, String.class);
    }
}
