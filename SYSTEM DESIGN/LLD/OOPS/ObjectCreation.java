/* OUTPUT
=====Implementation of annonymous object=====
Name: Brownie
Bread: Pappilon
Age: 10
Color: Brown
=====Implementation of name object======
Name: Tuffy
Bread, age and color are: Pedigree 12 Black
*/

import java.util.*;

class Dog {
  String name;
  String bread;
  int age;
  String color;
  Dog (String name, String bread, int age, String color) {
    this.name = name;
    this.bread = bread;
    this.age = age;
    this.color = color;
  }
  public void display() {
    System.out.println("Name: " + this.name);
    System.out.println("Bread: " + this.bread);
    System.out.println("Age: " + this.age);
    System.out.println("Color: " + this.color);
  }
  @Override
  public String toString() {
    return "Name: " + name + 
            "\nBread, age and color are: " + bread + " " + age + " " + color;
  }
}

public class ObjectCreation {
    public static void main(String[] args) {
      System.out.println("=====Implementation of annonymous object=====");
      new Dog("Brownie", "Pappilon", 10, "Brown").display();
      System.out.println("=====Implementation of name object======");
      Dog d1 = new Dog("Tuffy", "Pedigree", 12, "Black");
      System.out.print(d1);
    }
}
