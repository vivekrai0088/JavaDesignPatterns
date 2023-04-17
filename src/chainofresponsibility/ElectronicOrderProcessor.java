package chainofresponsibility;

public class ElectronicOrderProcessor implements OrderProcessor {

  OrderProcessor orderProcessor;

  @Override
  public void processOrder(Order order) {
    if(order.getProductType().equals(ProductType.ELECTRONIC)) {
      System.out.println("handled process order in electornic processor");
    } else {
      // orderProcessor.processOrder(order);
      System.out.println("Not able to handle for " + order.getProductType());
    }
  }

  @Override
  public void setNextProcessor(OrderProcessor nextProcessor) {
    this.orderProcessor = orderProcessor;
  }
}
