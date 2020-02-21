package com.ecomm.product.controller;

import com.ecomm.product.contract.Product;
import com.ecomm.product.repo.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {
    @Autowired
    ProductsRepo repo;
    public ProductController(){

    }
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return repo.findAll();
        /*List products=new ArrayList();
        Product p=new Product();
        products.add(p);
        return products;
        */
    }
}
