package name.ryong.javaTools.shape;

import java.util.ArrayList;
import java.util.List;






import name.ryong.javaTools.shape.impl.Square;
import name.ryong.javaTools.shape.impl.Triangle;
/**
 * 도형 테스트 클래스
 * JUnit은 적용하지 않았음. 
 * @author ryong
 */
public class TestShape {
  public static void main(String[] args) {
    List<Shape> list = new ArrayList<Shape>();
    Shape square = new Square(10);
    Shape triangle = new Triangle(10, 5);
    list.add(square);
    list.add(triangle);
    for(Shape shape : list){
      System.out.println(shape.getType() + " : " +shape.getArea());
    }
  }
}
