package org.example.records;

public record Rectangle(double length, double width) {
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double area() {
    return length * width;
  }
}
