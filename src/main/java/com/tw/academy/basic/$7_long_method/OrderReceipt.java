package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    public static final String TAB = "\t";
    public static final String LF = "\n";
    public static final double INIT_DOUBLE = 0d;
    public static final double TAX_RATE = .10;
    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //Deprecated
    public String printCustomerName() {
        return order.customer.getName();
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        // print headers
        output.append("======Printing Orders======" + LF);

        // print date, bill no, customer name
        output.append(order.customer.getName());
        output.append(order.customer.getAddress());

        // prints lineItems
        double totSalesTx = INIT_DOUBLE;
        double tot = INIT_DOUBLE;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(TAB);
            output.append(lineItem.getPrice());
            output.append(TAB);
            output.append(lineItem.getQuantity());
            output.append(TAB);
            output.append(lineItem.totalAmount());
            output.append(LF);

            // calculate sales tax @ rate of 10%
            double salesTax = lineItem.totalAmount() * TAX_RATE;
            totSalesTx += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            tot += lineItem.totalAmount() + salesTax;
        }

        // prints the state tax
        output.append("Sales Tax").append(TAB).append(totSalesTx);

        // print total amount
        output.append("Total Amount").append(TAB).append(tot);
        return output.toString();
    }
}
