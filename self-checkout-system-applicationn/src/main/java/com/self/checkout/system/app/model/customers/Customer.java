package com.self.checkout.system.app.model.customers;

public class Customer {
     private int customerId;
     private String customerName;
     private String contactNumber;
     public Customer(int customerId, String customerName, String contactNumber) {
         this.customerId = customerId;
         this.customerName = customerName;
         this.contactNumber = contactNumber; }
    public int getCustomerId() { return customerId; } public void setCustomerId(int customerId) { this.customerId = customerId; } public String getCustomerName() { return customerName; } public void setCustomerName(String customerName) { this.customerName = customerName; } public String getContactNumber() { return contactNumber; } public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; } }