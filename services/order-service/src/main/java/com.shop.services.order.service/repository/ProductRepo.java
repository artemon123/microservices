package com.shop.services.order.service.repository;

import com.shop.services.order.service.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
