package net.javaguides.springboot.service.serviceImpl;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.repository.ProductRepository;
import net.javaguides.springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product getById(Long id){
        return productRepository.findById( id ).get();
    }

    @Override
    public List<Product> searchItem(String query){
        return productRepository.searchItem(query);
    }
}
