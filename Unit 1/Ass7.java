import MCA.*;
import java.util.Scanner;

public class Ass7{

	static float a,b,c;
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers : ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		Mathematics obj1 = new Mathematics();
		Maximum obj2 = new Maximum();

		obj1.toAdd(a,b);
		obj1.toAdd(a,b,c);

		obj2.toMaximum(a,b,c);	

		System.gc();	
	}	

	protected void finalize(){
		a = 0.0f;
		b = 0.0f;
		c = 0.0f;
	}
}