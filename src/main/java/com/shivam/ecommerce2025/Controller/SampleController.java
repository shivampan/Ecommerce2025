package com.shivam.ecommerce2025.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sample")

public class SampleController {
    @GetMapping("/Sample1")
    public String Sample1(){
        return "This is Sample 1";
    }

    @GetMapping("/Sample2")
    public String Sample2(){
        return "This is Sample 2";
    }

}
