package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "API-Gateway", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
	
    @RequestMapping(method = RequestMethod.GET, value = "/compute-service/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b, @RequestParam(value = "accessToken") String s);

}
