import java.util.Scanner;

class MarksheetEx{

	private int rollno;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	private int total;
	private double percentage;

	MarksheetEx(int rollno, String name, int marks1, int marks2, int marks3){
		this.rollno = rollno;
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public void displayMarksheet(){
		total = marks1 + marks2 + marks3;
		percentage = (double)total/3;
		System.out.println("          STUDENT MARKSHEET");
		System.out.println("******************************");
		System.out.println("Student Roll Number : "+rollno);
		System.out.println("Student Name : "+name);
		System.out.println("Student First Subject Marks : "+marks1);
		System.out.println("Student Second Subject Marks : "+marks2);
		System.out.println("Student Third Subject Marks : "+marks3);
		System.out.println("Student Total Marks : "+total);
		System.out.println("Student Percentage : "+percentage);
	
		if(percentage>=85){
			System.out.println("Student grade is : Distinction.");
		}
		else if(percentage>=60 && percentage<85){
			System.out.println("Student grade is : First Class.");
		}
		else if(percentage>=40 && percentage<60){
			System.out.println("Student grade is : Second Class.");
		}
		else{
			System.out.println("Student grade is : Fail !");
		}

	}	
}

public class Marksheet{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int r,m1,m2,m3;
		String name;
		String a;

		System.out.println("******************************");
		System.out.println("Enter Student Roll Number : ");
		r = sc.nextInt();
		System.out.println("Enter Student Name : ");
		a=sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter First Subject Marks : ");
		m1 = sc.nextInt();
		System.out.println("Enter Second Subject Marks : ");
		m2 = sc.nextInt();
		System.out.println("Enter Third Subject Marks : ");
		m3 = sc.nextInt();
		System.out.println("******************************");

		MarksheetEx obj = new MarksheetEx(r,name,m1,m2,m3);
		obj.displayMarksheet();
	}
}