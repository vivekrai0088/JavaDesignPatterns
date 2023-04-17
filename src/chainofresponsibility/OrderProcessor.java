package chainofresponsibility;

public interface OrderProcessor {
  void processOrder(Order order);
  void setNextProcessor(OrderProcessor nextProcessor);
}
