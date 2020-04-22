package com.garage.product.repository;

import com.garage.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by minguss on 11/07/19.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
