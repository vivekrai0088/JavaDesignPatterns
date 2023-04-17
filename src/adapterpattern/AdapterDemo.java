package adapterpattern;

public class AdapterDemo {

  public static void main(String[] args) {
    Shape[] shapes = { new Rectangle(), new CircleAdapter(new Circle())};
    for(Shape shape : shapes) {
      shape.draw();
    }
  }
}
