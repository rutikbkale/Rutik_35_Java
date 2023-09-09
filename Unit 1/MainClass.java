import java.util.*;
abstract class Shape{
	abstract void area();
}

class Triangle extends Shape{
	void area(){
		Scanner sc = new Scanner(System.in);
		int base,height;
		double areaTriangle;
		System.out.println("Enter Base of Triangle : ");
		base = sc.nextInt();
		System.out.println("Enter Height of Triangle : ");
		height= sc.nextInt();

		
		areaTriangle = 0.5*(base*height);
		System.out.println("Area of Triangle is : "+areaTriangle);
	}
}

class Circle extends Shape{
	void area(){
		Scanner sc = new Scanner(System.in);
		int radius;
		double areaCircle;
		System.out.println("Enter Radius of Circle : ");
		radius = sc.nextInt();
		
		areaCircle = 3.142*radius*radius;
		System.out.println("Area of Circle is : "+areaCircle);
	}
}

public class MainClass{
	public static void main(String a[]){
		Shape s;
		Triangle t = new Triangle();
		Circle c = new Circle();
		s = t;
		s.area();
		s = c;
		s.area();
	}
}