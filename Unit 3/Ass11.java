//Write a program using user defined exception.

import java.io.*;

class MyException extends Exception{
	public String toString(){
		return "Your age is out of range.";
	}
}

class Student{
	int age;
	Student(int age){
		this.age = age;
		try{
			if(!(age>=14 && age <=21)){
				throw new MyException();
			}
		}
		catch(MyException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Your Age is : "+age);
		}
	}
}

class Ass11{
	public static void main(String arg[]) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your age :");
		int age = Integer.parseInt(br.readLine());
		Student obj = new Student(age);
		
	}
}