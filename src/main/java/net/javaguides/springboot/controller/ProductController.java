package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @PostMapping
    ResponseEntity<Product> createProductE(@RequestBody Product product){
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/getById/{id}")
    Product getProductId(@PathVariable Long id){
        return productService.getById(id);
    }

    @GetMapping("/search/{query}")
     ResponseEntity<List<Product>> searchAll(@PathVariable String query){
        return ResponseEntity.ok(productService.searchItem(query));
    }
}
