package com.yy.zia.demo.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lihaodi on 2017/5/30.
 */

@RestController
@RequestMapping("demo")
public class DemoController {

	@RequestMapping(method = GET)
	public Map<String, String> getTest() {
		Map<String, String> map = new HashMap<>();
		map.put("data", "unprotected_data");
		return map;
	}

}
