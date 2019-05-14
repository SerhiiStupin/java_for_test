package ru.stqa.pft.sandbox;

public class MyFirstPro {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Sergey");

    double l = 5;
    System.out.println("Площадь квадарата со сторой " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со свторнами " + a + " и " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l) {
    return l * l;
  }
  public static double area(double a, double b) {
    return a * b;
  }
}