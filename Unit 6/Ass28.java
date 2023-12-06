//Q28. WAP for TreeMap.

import java.util.*;

class Ass28{
	public static void main(String arg[]){
		Map TM = new TreeMap();
		String key[] ={"Mh", "MP", "UP", "Pb", "Ka", "AP"};
		String value[] ={"Mumbai", "Bhopal", "Lucknow", "Chandigarh", "Bangaluru", "Hydrabad"};
		for(int i=0; i<5; i++){
			TM.put(key[i],value[i]);
		}
		System.out.println("States and their capitals : \n\t\t"+TM);
		
	}
}