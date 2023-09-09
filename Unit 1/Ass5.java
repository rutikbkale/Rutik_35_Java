import java.util.*;
class BaseClass{
	int n1,n2;
	public void get(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
}

class DerivedClass extends BaseClass{
	void disMax(){
		if(super.n1>super.n2){
			System.out.println(super.n1 +" is Maximum Number.");
		}
		else{
			System.out.println(super.n2 +" is Maximum Number.");
		}
	}

	void disMin(){
		if(super.n1<super.n2){
			System.out.println(super.n1 +" is Minmum Number.");
		}
		else{
			System.out.println(super.n2 +" is Minimum Number.");
		}
	}
}

public class Ass5{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter Two Numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		DerivedClass obj = new DerivedClass();
		obj.get(n1,n2);
		obj.disMax();
		obj.disMin();
	}
}