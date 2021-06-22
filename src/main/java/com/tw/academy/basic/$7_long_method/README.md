### CODE SMELL

- Dead code
  - OrderReceipt.java: remove //        output.append("Date - " + order.getDate();
  - OrderReceipt.java: remove //        output.append(order.getCustomerLoyaltyNumber());
  - LineItem.java: remove super()
  - remove unuseful comment in OrderReceipt.java
  - remove todo in OrderReceipt.java
- Magic number
  - extract constant in OrderReceipt.java
- Naming
  - LineItem.java:p -> price
  - OrderReceipt.java:o -> order
- Long method
- Primitive obsession
  - extract Customer.java from Order.java
- Make field final
  - LineItem.java make all field final
  - OrderReceipt.java make field final
