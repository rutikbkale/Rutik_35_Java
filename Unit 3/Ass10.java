// WAP to find out maximum of array elements and cheack for array limit using exception handling.

import java.util.Scanner;

class Ass10{
	static int n;
	static int arr[];
	static int max;
	static Scanner sc = new Scanner(System.in);
	static void inputArray(){
		try{
			System.out.println("Enter Number of Array Elements :");
			n = sc.nextInt();
			arr = new int[n];
			System.out.println("Enter array elements :");
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Accessing invalid array index !");
		}
	}

	static int displayMax(){
		try{
			max=arr[0];
			for(int i=0;i<n;i++){
				if(arr[i]>arr[0]){
					max = arr[i];
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Accessing invalid array index !");
		}
		finally{
			return max;

		}
	}

	public static void main(String arg[]){
		inputArray();
		System.out.println("Maximum number is : "+displayMax());
		System.out.println("Array elements goes upto : "+n);
	}	
	
} 