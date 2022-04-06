package com.ycw.pm.controller;

import com.ycw.pm.domain.Demo;
import com.ycw.pm.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;

    @GetMapping("list")
    public List<Demo> list() {
        return demoService.list();
    }
}
