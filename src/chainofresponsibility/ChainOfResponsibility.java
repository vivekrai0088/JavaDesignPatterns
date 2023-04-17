package chainofresponsibility;

// behavioral design pattern that allows an object to pass a request through a chain of handlers until one of them handles the request.
// The principle behind the Chain of Responsibility pattern is to create a chain of objects that can handle requests.
// Each object in the chain has a reference to the next object in the chain. When a request is made, it is passed down
// the chain until one of the objects handles it. If none of the objects in the chain can handle the request, it is simply not handled.
public class ChainOfResponsibility {
  public static void main(String[] args) {
    OrderProcessor bookOrderProcessor = new BookOrderProcessor();
    OrderProcessor electronicOrderProcessor = new ElectronicOrderProcessor();
    bookOrderProcessor.setNextProcessor(electronicOrderProcessor);

    Order bookOrder = new Order(ProductType.BOOK);
    Order electronicOrder = new Order(ProductType.ELECTRONIC);
    Order clothingOrder = new Order(ProductType.CLOTHING);

    bookOrderProcessor.processOrder(bookOrder);
    bookOrderProcessor.processOrder(electronicOrder);
    bookOrderProcessor.processOrder(clothingOrder);
  }
}

