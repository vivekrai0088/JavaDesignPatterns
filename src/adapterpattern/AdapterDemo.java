package adapterpattern;

// The Adapter pattern is a structural design pattern that allows incompatible classes to work together by wrapping an
// interface around an existing class. The adapter acts as a bridge between the client and the target class, translating
// requests from the client into a format that the target class can understand.
public class AdapterDemo {

  public static void main(String[] args) {
    Shape[] shapes = { new Rectangle(), new CircleAdapter(new Circle())};
    for(Shape shape : shapes) {
      shape.draw();
    }
  }
}
