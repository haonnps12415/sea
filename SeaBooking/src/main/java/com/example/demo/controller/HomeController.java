package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ccdjtmemay")
public class HomeController {
	@RequestMapping("")
	public String home() {
		return "site/index.html" ;
	}
}
