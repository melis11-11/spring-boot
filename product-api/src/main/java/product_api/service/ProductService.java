package com.example.productapi.service;

import com.example.productapi.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {

    private final Map<Long, Product> products = new ConcurrentHashMap<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    public Optional<Product> getProductById(Long id) {
        return Optional.ofNullable(products.get(id));
    }

    public Product createProduct(Product product) {
        Long id = nextId.getAndIncrement();

        product.setId(id);
        products.put(id, product);

        return product;
    }

    public Optional<Product> updateProduct(Long id, Product updatedProduct) {
        Product existingProduct = products.get(id);

        if (existingProduct == null) {
            return Optional.empty();
        }

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());

        products.put(id, existingProduct);

        return Optional.of(existingProduct);
    }

    public boolean deleteProduct(Long id) {
        Product removedProduct = products.remove(id);

        return removedProduct != null;
    }
}