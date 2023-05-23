package ru.stqa.pft.sandbox;

public class Point {
  public double xAxis;
  public double yAxis;

  public Point(double xAxis, double yAxis) {
    this.xAxis = xAxis;
    this.yAxis = yAxis;
  }

  public double distance(Point p1){
    return Math.sqrt((this.xAxis - p1.xAxis)*(this.xAxis - p1.xAxis) + (this.yAxis-p1.yAxis)*(this.yAxis-p1.yAxis));
  }
}
