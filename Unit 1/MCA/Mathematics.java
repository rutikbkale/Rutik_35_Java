/*
Write a program to create a package MCA inside that create two classes first is Mathematics and second is Maximum and using finalize method.
*/

package MCA;

public class Mathematics{
	float a,b,c,add;

	public void toAdd(float a, float b){
		this.a = a;
		this.b = b;
		add= a+b;
		System.out.println("Addition is : "+add);
	}

	public void toAdd(float a, float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
		add= a+b+c;
		System.out.println("Addition is : "+add);
	}
}