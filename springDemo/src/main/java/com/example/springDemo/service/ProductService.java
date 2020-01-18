//package com.example.springDemo.service;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.springDemo.domain.Product;
//import com.example.springDemo.repository.ProductRepository;
//
//@Service
//public class ProductService {
//	
//	@Autowired
//	public ProductRepository productRepository;
//	
//	public Product getProduct(Long productId) {
//		Product product = productRepository.findById(productId).get();
//		return product;
//	}
//
//}
