package com.ycw.pm.controller;

import com.ycw.pm.domain.Test;
import com.ycw.pm.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
//如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
//如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World4!";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post，" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}