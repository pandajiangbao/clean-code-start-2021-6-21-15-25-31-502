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

        printHeaders(output);

        printCustomerInfo(output);

        printLineItems(output);

        double totSalesTx = order.calculateTotalSalesTax(TAX_RATE);
        double tot = order.calculateTotal(TAX_RATE);

        printStateTax(output, totSalesTx);

        printTotalAmount(output, tot);
        return output.toString();
    }

    private void printLineItems(StringBuilder output) {
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(TAB);
            output.append(lineItem.getPrice());
            output.append(TAB);
            output.append(lineItem.getQuantity());
            output.append(TAB);
            output.append(lineItem.totalAmount());
            output.append(LF);
        }
    }

    private void printTotalAmount(StringBuilder output, double tot) {
        output.append("Total Amount").append(TAB).append(tot);
    }

    private void printStateTax(StringBuilder output, double totSalesTx) {
        output.append("Sales Tax").append(TAB).append(totSalesTx);
    }

    private void printCustomerInfo(StringBuilder output) {
        output.append(order.customer.getName());
        output.append(order.customer.getAddress());
    }

    private void printHeaders(StringBuilder output) {
        output.append("======Printing Orders======" + LF);
    }
}
