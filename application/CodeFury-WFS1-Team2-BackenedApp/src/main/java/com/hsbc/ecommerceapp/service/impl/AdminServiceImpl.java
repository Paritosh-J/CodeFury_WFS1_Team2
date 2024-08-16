package com.hsbc.ecommerceapp.service.impl;

import com.hsbc.ecommerceapp.model.Product;
import com.hsbc.ecommerceapp.model.Subscription;
import com.hsbc.ecommerceapp.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(String productId) {

    }

    @Override
    public void deactivateSubscription(String subscriptionId) {

    }

    @Override
    public void activateSubscription(String subscriptionId) {

    }

    @Override
    public List<Product> viewAllProducts() {
        return List.of();
    }

    @Override
    public List<Subscription> viewAllSubscriptions() {
        return List.of();
    }
}
