//Q30. WAP for LinkedHashSet.

import java.util.*;

class Ass30{
	public static void main(String arg[]){
		Set s = new LinkedHashSet();
		Object arr[] = {"ABC", null, 45, 'R', "XYZ", 45};
		for(int i=0; i<6; i++){
			s.add(arr[i]);
		}
		System.out.println("LinkedHashSet Elements : "+s);
		
	}
}