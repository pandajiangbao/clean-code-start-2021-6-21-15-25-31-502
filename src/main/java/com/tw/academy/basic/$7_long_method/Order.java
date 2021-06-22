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
}
