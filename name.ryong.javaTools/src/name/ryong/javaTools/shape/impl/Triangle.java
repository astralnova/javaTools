package name.ryong.javaTools.shape.impl;

import name.ryong.javaTools.shape.Shape;
/**
 * 삼각형
 * @author ryong
 */
public class Triangle implements Shape {
  private double height;
  private double width;
  
  public Triangle(double height, double width){
    this.height = height;
    this.width = width;
  }
  /**
   * {@inheritDoc}
   */
  @Override
  public double getArea() {
    return height * width / 2;
  }
  /**
   * {@inheritDoc}
   */
  @Override
  public String getType() {
    return "삼각형";
  }
  
}