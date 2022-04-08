package com.himanshu.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.himanshu.model.Product;

import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    Page<Product> findAllProductsPageable(Pageable pageable);

}
