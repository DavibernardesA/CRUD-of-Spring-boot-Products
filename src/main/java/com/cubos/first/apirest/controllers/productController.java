package com.cubos.first.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cubos.first.apirest.models.Product;
import com.cubos.first.apirest.repositories.ProductRepository;
import com.cubos.first.apirest.utils.ResponseHandler;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class productController {
  @Autowired
  private ProductRepository productRepository;

  //show products
  @GetMapping("")
  public List<Product> index() {
    return productRepository.findAll();
  }

  //show product
  @GetMapping("/{id}")
  public ResponseEntity<Object> show(@PathVariable Integer id) {
    Optional<Product> product = productRepository.findById(id);
    if (!product.isPresent()) {
      return ResponseHandler.generate("product not found.", HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<Object>(product.get(), HttpStatus.OK);
  }

  //create product
  @PostMapping("")
  public ResponseEntity<Object> store(@RequestBody @Valid Product product) {
    Product newProduct = productRepository.save(product);
    return new ResponseEntity<Object>(newProduct, HttpStatus.CREATED);
  }

  //update product
  @PutMapping("/{id}")
  public ResponseEntity<Object> update(@PathVariable Integer id,@RequestBody @Valid Product product) {
    Optional<Product> Oldproduct = productRepository.findById(id);

    if(!Oldproduct.isPresent()) {
      return ResponseHandler.generate("Product not found.", HttpStatus.NOT_FOUND);
    }

    Product updateProduct = Oldproduct.get();
    updateProduct.setName(product.getName());
    updateProduct.setDescription(product.getDescription());
    updateProduct.setPrice(product.getPrice());

    productRepository.save(updateProduct);

    return ResponseEntity.noContent().build();
  }

  //delete product
  @DeleteMapping("/{id}")
  public ResponseEntity<Object> delete(@PathVariable Integer id) {
    Optional<Product> product = productRepository.findById(id);

    if(!product.isPresent()) {
      return ResponseHandler.generate("Product not found.", HttpStatus.NOT_FOUND);
    }

    productRepository.delete(product.get());
    return ResponseEntity.noContent().build();
  }
}
