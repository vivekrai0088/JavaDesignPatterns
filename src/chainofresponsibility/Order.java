package chainofresponsibility;

public class Order {

  public Order(ProductType productType) {
    this.productType = productType;
  }

  ProductType productType;

  public ProductType getProductType() {
    return productType;
  }
}
