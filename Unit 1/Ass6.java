import java.util.Scanner;

public class Ass6{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3;

		System.out.println("Enter the 3 sides of part of the Machine : ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();

		Part obj = new Part(s1,s2,s3);
		obj.innerVolume();
		obj.outerVolume();
	}
}

interface Volume{
	public void innerVolume();
	public void outerVolume();
}

class Part{

	private int s1;
	private int s2;
	private int s3;
	private double calVolume;

	public Part(int s1, int s2, int s3){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public void innerVolume(){
		calVolume = (3.142*s1*s2*s3)/3;
		System.out.println("Volume of inner part of the Machine is : "+String.format("%.4f",calVolume));
	}

	public void outerVolume(){
		calVolume = 4*(3.142*s1*s2*s3)/3;
		System.out.println("Volume of outer part of the Machine is : "+String.format("%.4f",calVolume));
	}
}

