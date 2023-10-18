// WAP to use multiple threads use setName() and display getName().

import java.util.Scanner;

class Ass16 extends Thread{
	String name;
	public void run(){
		Ass16 obj = new Ass16();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thread name : ");
		name = sc.nextLine();
		obj.setName(name);
		System.out.println("Thread Name is :"+obj.getName());
	}

	public static void main(String arg[]){
		Ass16 obj1 = new Ass16();
		Ass16 obj2 = new Ass16();
		obj1.start();
		try{
			obj1.join();
		}
		catch(Exception e){
			System.out.println(e);
		}
		obj2.start();
	}
}