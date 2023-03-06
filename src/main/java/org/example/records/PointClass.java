package org.example.records;

import java.util.Objects;

public class PointClass {
  private final int x;
  private final int y;

  public PointClass(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int x() {
    return x;
  }

  public int y() {
    return y;
  }

  public boolean equals(Object o) {
    if (!(o instanceof PointClass other)) {
      return false;
    }

    return other.x == x && other.y == y;
  }

  public int hashCode() {
    return Objects.hash(x, y);
  }

  public String toString() {
    return "Point[x=%d, y=%d]".formatted(x, y);
  }
}
