import java.util.Scanner;
public class Pattern2{
	public static void main(String a[]){
		for(int i=1;i<=3;i++){
			for(int j=1; j<=5; j++){
				if((j<=3-i)|| (j>=3+i)){
					System.out.print("   ");
				}
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=1;i<=2;i++){
			for(int j=1; j<=5; j++){
				if((j>5-i)|| (j<=i)){
					System.out.print("   ");
				}
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
	}
}