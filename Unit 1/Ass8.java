import java.util.Scanner;
import Games.*;

public class Ass8{
	Scanner sc = new Scanner(System.in);

	public void inputRecords(int noStudent){
		
	}

	public static void main(String arg[]){
		int noStudent;
		String name;
		System.out.println("Enter Number of Student : ");
		noStudent = sc.nextInt();
		Indoor obj[] = new Indoor[noStudent];
		for(int i=0;i<noStudent;i++){
			System.out.println("Enter Student Name : ");
			name = sc.nextInt();
			obj[i] = new Indoor(name);
		}
		
		
	}
}