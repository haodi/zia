package com.yy.zia.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by lihaodi on 2017/5/30.
 */

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping(method = GET)
    public Map<String, String> getTest() {
        Map<String, String> map = new HashMap<>();
        map.put("data", "protected_data");
        return map;
    }
}