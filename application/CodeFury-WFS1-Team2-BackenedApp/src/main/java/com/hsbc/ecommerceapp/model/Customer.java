package com.hsbc.ecommerceapp.model;

public class Customer extends User {
    private String address, phoneNumber;

    public Customer(String userId, String userName, String password, String email) {
        super(userId, userName, password, email);
    }
}
