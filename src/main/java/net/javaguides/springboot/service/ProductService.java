package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    Product getById(Long id);
    List<Product> searchItem(String query);

}
