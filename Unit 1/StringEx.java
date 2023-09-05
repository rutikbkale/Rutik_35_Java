import java.util.Scanner;
public class StringEx{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Word :");
		String word1 = sc.nextLine();
		System.out.println("Enter The Second Word :");
		String word2 = sc.nextLine();
		if(word1.equals(word2))
			System.out.println(word1+ " is equals to "+word2+".");
		else
			System.out.println(word1+ " is not equals to "+word2+".");
	}
}