//Q29. WAP for Vector.

import java.util.*;

class Ass29{
	public static void main(String arg[]){
		List v = new Vector();
		v.add(10);
                v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		int sum=0,r;
		for(int i=0; i<v.size(); i++){
			r =(int)v.get(i);
			sum += r;

		}
		System.out.println("Elements in Vector : "+v);
		System.out.println("Summation of Elements in Vector : "+sum);
	}
}