package ru.stqa.pft.sandbox;

public class MyFirstPro {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Sergey");

    Square s = new Square(5);
    System.out.println("Площадь квадарата со сторой " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь прямоугольника со свторнами " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}