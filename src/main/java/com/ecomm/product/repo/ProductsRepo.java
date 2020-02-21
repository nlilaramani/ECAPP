package com.ecomm.product.repo;

import com.ecomm.product.contract.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductsRepo extends JpaRepository<Product,Integer> {

}
