package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchItem(String query);

//
//    @Query(value = "SELECT * FROM products p WHERE " +
//            "p.name LIKE CONCAT('%',:query, '%')" +
//            "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
//    List<Product> searchProductsSQL(String query);

//    @Query("SELECT p FROM product p WHERE "+
//            " p.name LIKE CONCAT('%', :query, '%')"+
//            " Or p.description LIKE CONCAT('%', :query, '%') ")
//    List<Product> searchItem(String query);

}
