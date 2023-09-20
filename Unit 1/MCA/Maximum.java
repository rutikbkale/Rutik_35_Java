package MCA;

public class Maximum{
	float a,b,c;

	public void toMaximum(float a,float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;

		if(a>b && a>c){
			System.out.println(a+" is Maximum Number.");
		}
		else if(b>a && b>c){
			System.out.println(b+" is Maximum Number.");
		}
		else if(c>b && c>a){
			System.out.println(c+" is Maximum Number.");
		}
		else{
			System.out.println("All Numbers are equal.");
		}
	}
}