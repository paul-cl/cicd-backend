package com.garage.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
	@GetMapping("/")
    public String list() {
        return "products";
    }
}
