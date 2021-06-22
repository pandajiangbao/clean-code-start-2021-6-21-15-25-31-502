package com.tw.academy.basic.$7_long_method;

import java.util.List;

public class Order {
    final Customer customer;
    List<LineItem> lineItems;

    public Order(Customer customer, List<LineItem> lineItems) {
        this.customer = customer;
        this.lineItems = lineItems;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public double calculateTotalSalesTax(double taxRate) {
        return this.lineItems.stream().mapToDouble(e -> e.calculateSalesTax(taxRate)).sum();
    }

    public double calculateTotal(double taxRate){
        return this.lineItems.stream().mapToDouble(LineItem::totalAmount).sum()+calculateTotalSalesTax(taxRate);
    }
}
