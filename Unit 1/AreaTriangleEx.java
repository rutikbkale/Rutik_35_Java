import java.util.Scanner;

public class AreaTriangleEx{

public static double Area(int height, int breadth){
	return (0.5*height*breadth);
}
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter The Height & Breadth :");
		int h = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Area Of Triangle is : "+Area(h,b));
	}
}