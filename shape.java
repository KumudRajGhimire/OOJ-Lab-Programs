import java.util.Scanner;

abstract class Shape{
int a;
int b;

abstract void printArea();
}

class Rectangle extends Shape{
public Rectangle(int length, int breadth){
this.a = length;
this.b = breadth;
}

void printArea(){
System.out.println("Area of rectangle is "+(a*b));
}
}



class Triangle extends Shape{
public Triangle(int base, int height){
this.a = base;
this.b = height;
}

void printArea(){
System.out.println("Area of triangle is "+(a*b/2));
}
}



class Circle extends Shape{
public Circle(int radius){
this.a = radius;
}

void printArea(){
System.out.println("Area of circle is "+(3.14*a*a));
}
}



class Main{
public static void main(String[] args){

Scanner s = new Scanner(System.in);
System.out.println("Enter length and breadth of rectangle: ");
int l = s.nextInt();
int b = s.nextInt();
Rectangle myRect = new Rectangle(l,b);
myRect.printArea();

System.out.println("\nEnter base and height of triangle: ");
int m = s.nextInt();
int n = s.nextInt();
Triangle myTri = new Triangle(m,n);
myTri.printArea();

System.out.println("\nEnter the radius of circle: ");
int r = s.nextInt();
Circle myCirc = new Circle(r);
myCirc.printArea();

}
}