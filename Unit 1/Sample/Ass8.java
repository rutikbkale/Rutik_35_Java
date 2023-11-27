package Sample;
import java.util.Scanner;
import Games.*;

public class Ass8{
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int noStudent;
		String name;

		System.out.println("Enter Number of Student : ");
		noStudent = sc.nextInt();

		Indoor in[] = new Indoor[noStudent];

		for(int i=0;i<noStudent;i++){
			System.out.println("Enter Student Name : ");
			name = sc.nextLine();
			in[i] = new Indoor(name);
		}

		Outdoor out[] = new Outdoor[noStudent];

		for(int i=0;i<noStudent;i++){
			System.out.println("Enter Student Name : ");
			name = sc.nextLine();
			out[i] = new Outdoor(name);
		}

		System.out.println("Indoor Game Players Name :");
		for(int i=0;i<noStudent;i++){
			in[i].displayName();
		}

		System.out.println("Outdoor Game Players Name :");
		for(int i=0;i<noStudent;i++){
			out[i].displayName();
		}
		
		sc.close();
	}
}