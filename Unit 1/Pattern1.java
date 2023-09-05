import java.util.Scanner;
public class Pattern1{
	public static void main(String a[]){
		for(int i=1;i<=3;i++){
			for(int j=1; j<=5; j++){
				if((j<=i-1)|| (j>6-i)){
					System.out.print("   ");
				}
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
	}
}