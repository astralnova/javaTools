package name.ryong.javaTools.shape.impl;

import name.ryong.javaTools.shape.Shape;
/**
 * 정사각형
 * @author ryong
 */
public class Square implements Shape {
  private double width;

  public Square(double width){
    this.width = width;
  }
  /**
   * {@inheritDoc}
   */
  @Override
  public double getArea() {    
    return width * width;
  }
  /**
   * {@inheritDoc}
   */
  @Override
  public String getType() {
    return "정사각형";
  }
}