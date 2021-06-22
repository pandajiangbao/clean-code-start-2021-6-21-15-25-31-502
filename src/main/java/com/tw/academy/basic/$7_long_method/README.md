### CODE SMELL

- Dead code
  - OrderReceipt.java: remove //        output.append("Date - " + order.getDate();
  - OrderReceipt.java: remove //        output.append(order.getCustomerLoyaltyNumber());
  - LineItem.java: remove super()
- Magic number
- Naming
  - LineItem.java:p -> price
  - OrderReceipt.java:o -> order
- Long method
- Primitive obsession
- Make field final
  - LineItem.java make all field final
  - OrderReceipt.java make field final
