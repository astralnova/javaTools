package name.ryong.javaTools.shape;
/**
 * 도형
 * @author ryong
 */
public interface Shape {
  /**
   * 넓이를 구한다.
   * @return 도형의 넓이
   */
  public double getArea();
  
  /**
   * 자신이 어떤 도형인지 구한다.
   * @return 도형의 종류
   */
  public String getType();
}