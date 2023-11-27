import java.util.Scanner;

class Marksheet {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int r, m1, m2, m3, noStudent;
        String name;
        String a;

        System.out.println("Enter Number of Student : ");
        noStudent = sc.nextInt();
        MarksheetEx obj[] = new MarksheetEx[noStudent];
        for (int i = 0; i < noStudent; i++) {
            System.out.println("******************************");
            System.out.println("\n Enter " + (i+1) + " Student Information : \n");
            System.out.println("Enter Student Roll Number : ");
            r = sc.nextInt();
            System.out.println("Enter Student Name : ");
            a = sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter First Subject Marks : ");
            m1 = sc.nextInt();
            System.out.println("Enter Second Subject Marks : ");
            m2 = sc.nextInt();
            System.out.println("Enter Third Subject Marks : ");
            m3 = sc.nextInt();
            System.out.println("******************************");

           obj[i] = new MarksheetEx(r, name, m1, m2, m3);
           
        }
        
         System.out.println("\n\n                                    STUDENT MARKSHEET");
        System.out.println("************************************************************************************\n\n");
        System.out.println("RollNo\tName\t\tMarks1\tMarks2\tMarks3\tTotal\tPercentage\tGrade\n");
        for (int i = 0; i < noStudent; i++) {
                obj[i].displayMarksheet(); 
        }
	System.out.println();
        System.out.println("************************************************************************************");
    }
}


class MarksheetEx {

    private final int rollno;
    private final String name;
    private final int marks1;
    private final int marks2;
    private final int marks3;
    private int total;
    private float percentage;
    private static String grade;

    MarksheetEx(int rollno, String name, int marks1, int marks2, int marks3) {
        this.rollno = rollno;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void displayMarksheet() {
        total = marks1 + marks2 + marks3;
        percentage = (float) total / 3;
        if(percentage>=85 && percentage<100){
		System.out.println("\n                                    Distinction Student");
        	System.out.println("************************************************************************************\n\n");
              	System.out.println(rollno + "\t" + name +  "\t" + marks1 + "\t" + marks2 + "\t" + marks3 + "\t" + total + "\t" + String.format("%.2f", percentage) + "\t\t" + displayGrade(percentage));
	}
	else if(percentage>=60 && percentage<85){
		System.out.println("\n                                    First Class Student");
        	System.out.println("************************************************************************************\n\n");
              	System.out.println(rollno + "\t" + name +  "\t" + marks1 + "\t" + marks2 + "\t" + marks3 + "\t" + total + "\t" + String.format("%.2f", percentage) + "\t\t" + displayGrade(percentage));
	}
	else if(percentage>=40 && percentage<60){
		System.out.println("\n                                    Second Class Student");
        	System.out.println("************************************************************************************\n\n");
              	System.out.println(rollno + "\t" + name +  "\t" + marks1 + "\t" + marks2 + "\t" + marks3 + "\t" + total + "\t" + String.format("%.2f", percentage) + "\t\t" + displayGrade(percentage));
	}
	else{
		System.out.println("\n                                    Fail Student");
        	System.out.println("************************************************************************************\n\n");
              	System.out.println(rollno + "\t" + name +  "\t" + marks1 + "\t" + marks2 + "\t" + marks3 + "\t" + total + "\t" + String.format("%.2f", percentage) + "\t\t" + displayGrade(percentage));
	}
    }


    public static String displayGrade(float percentage) {
        if (percentage >= 85) {
            grade = "Distinction";
            return grade;
        } else if (percentage >= 60 && percentage < 85) {
            grade = "First Class";
            return grade;
        } else if (percentage >= 40 && percentage < 60) {
            grade = "Second Class";
            return grade;
        } else {
            grade = "Fail";
            return grade;
        }
    }
}

