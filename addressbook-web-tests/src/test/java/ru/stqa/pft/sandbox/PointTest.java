package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test

  public void testPoint() {
    Point p = new Point(280,  400);
    Assert.assertEquals (p.distance(), 120.0);
  }
}
