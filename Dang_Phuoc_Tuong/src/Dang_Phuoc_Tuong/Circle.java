package Dang_Phuoc_Tuong;


import java.util.Scanner;


public class Circle {
double radius;
double pi;
Circle(){
	radius=0;
}
Circle( double r){
	pi=3.14;
	radius =r;
}
public  void input() {
	Scanner R = new Scanner(System.in);
	System.out.println("Enter Radius:");
	radius = R.nextDouble();
}
public void output() {
	System.out.println("the Radius: "+radius);
}
public String toString() {
	return "the Radius: "+radius ;
}
public  double  area() {
	return pi*(radius*radius);
}

public double perimeter() {
	return 2*pi*radius*2;
}
public static void main(String[] args) {
	Circle Cir = new Circle(2);
	Cir.input();
	Cir.output();
	System.out.println(    Cir    );
	System.out.println(    Cir.area()   );
	System.out.println(    Cir.perimeter()    );
}
}

