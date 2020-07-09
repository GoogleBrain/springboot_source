package cn.k.spring_initializer.controller;

import cn.k.spring_initializer.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstIni  {

    @Autowired
    private FirstService firstService;

    @GetMapping("/first")
    public String first(){
        return firstService.test();
    }
}
