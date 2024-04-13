package com.self.checkout.system.app.model.item;

import java.util.Date;

public class Item {
        private int itemId;
        private String itemDesc;
        private double unitPrice;
        private int qty;
        private String customer;
        private String contactNumber;
        private int transactionNumber;
        private Date transactionDate;


        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public String getItemDesc() {
            return itemDesc;
        }

        public void setItemDesc(String itemDesc) {
            this.itemDesc = itemDesc;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public String getCustomer() {
            return customer;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public int getTransactionNumber() {
            return transactionNumber;
        }

        public void setTransactionNumber(int transactionNumber) {
            this.transactionNumber = transactionNumber;
        }

        public Date getTransactionDate() {
            return transactionDate;
        }

        public void setTransactionDate(Date transactionDate) {
            this.transactionDate = transactionDate;
        }
    }


