package com.hsbc.ecommerceapp.service;

import com.hsbc.ecommerceapp.model.Subscription;

import java.util.List;

public interface CustomerService {
    void placeOrder(Subscription subscription);
    void cancelOrder(String subscriptionId);
    void updateCustomerInfo(String customerId, String address, String phoneNumber);
    void changeSubscriptionPlan(String subscriptionId, String newPlan);
    List<Subscription> viewOrder(String customerId);
}
