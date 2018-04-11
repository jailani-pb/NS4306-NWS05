package com.nep.nws05.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nep.nws05.model.Product;
import com.nep.nws05.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping(value = "/")
	public String index(ModelMap modelMap) {
		modelMap.put("name", "Samsung Galaxy S9");
		modelMap.put("description", "This is a smartphone");
		modelMap.put("price", 1299.99);
		return "index";
	}
	
	@RequestMapping(value = "/products")
	public String listOfProducts(ModelMap modelMap) {
		ArrayList<String> products = new ArrayList<String>();
		products.add("Samsung Galaxy S9");
		products.add("iPhone X");
		products.add("HTC One X");
		products.add("Oppo R9");
		modelMap.put("products", products);
		return "listofproducts";
	}
	
	@RequestMapping(value = "/add")
	public String add() {
		return "addproduct";
	}
	
	@RequestMapping(value = "/add/product")
	public String addProduct(
			@RequestParam(required=true) String name,
			@RequestParam(required=true) String description,
			@RequestParam(required=true) double price,
			@RequestParam(required=true) boolean instock
			) {
		Product p = 
			new Product(name, description, price, instock);
		productRepository.save(p);
		return "redirect:/add";
	}
	
}




