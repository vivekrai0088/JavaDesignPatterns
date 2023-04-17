package chainofresponsibility;

public class BookOrderProcessor implements OrderProcessor {

  OrderProcessor nextOrderProcessor;

  @Override
  public void processOrder(Order order) {
    if(order.getProductType().equals(ProductType.BOOK)) {
      System.out.println("handled process order in book processor");
    } else {
      nextOrderProcessor.processOrder(order);
    }
  }

  @Override
  public void setNextProcessor(OrderProcessor nextOrderProcessor) {
    this.nextOrderProcessor = nextOrderProcessor;
  }
}
