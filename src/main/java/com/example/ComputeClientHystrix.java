package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeClientHystrix implements ComputeClient {
    
	@Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, @RequestParam(value ="accessToken") String s) {
        return -9999;
	}
	
}