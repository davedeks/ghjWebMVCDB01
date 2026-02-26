package com.mssq301.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.mssq301.model.Product;
import com.mssq301.repository.ProductRepository;
import java.util.List;

@Controller
public class ProductController {

    private final ProductRepository productRepository;

    // Constructor injection is the recommended practice
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "product-list"; // This refers to src/main/resources/templates/product-list.html
    }

    @GetMapping("/products/new")
    public String showForm(Product product) {
        return "add-product";
    }

    @PostMapping("/products")
    public String addProduct(Product product) {
        productRepository.save(product);
        return "redirect:/products";
    }
}

