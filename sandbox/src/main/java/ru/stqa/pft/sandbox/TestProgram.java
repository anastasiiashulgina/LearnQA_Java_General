package ru.stqa.pft.sandbox;

public class TestProgram {
  public static void main(String[] args) {
    Point p1 = new Point(1, 1);

    Point p2 = new Point(1, 2);

    System.out.println("Distance between 2 points is " + p1.distance(p2));

  }

//  public double distance(Point p1, Point p2){
//    return Math.sqrt((p1.xAxis - p2.xAxis)*(p1.xAxis - p2.xAxis) + (p1.yAxis-p2.yAxis)*(p1.yAxis-p2.yAxis));
//  }

}