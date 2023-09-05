import java.util.Scanner;

public class Number {

    static Scanner sc = new Scanner(System.in);
    static int noOfSub;
    static int marks[];
    static int total;
    static boolean flag ;
    
    private static void displayMarks(){
        System.out.print("Student Marks Is : ");
        for(int i=0;i<noOfSub;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println("\n*********************************************************************\n");
        
    }
    
    private static void displayTotalMarks(){
        total =0;
        for(int i=0;i<noOfSub;i++){
            total = total+marks[i];
        }
        System.out.println("Students Total Marks Is : "+total);
        System.out.println("\n*********************************************************************\n");
    }
    
    private static void displayAverage(){
        int avg = total/noOfSub;
        System.out.println("Average Of Student Marks Is : "+avg);
        System.out.println("\n*********************************************************************\n");
    }
    
    private static void exit(){
        flag=false;
        System.out.println("Thank You for Using This Application ............");
         System.out.println("\n*********************************************************************\n");
    }
    
    public static void main(String[] args) {
       
        flag = true;
        
            System.out.println("\n*********************************************************************\n");         
            System.out.println("Enter Number of Subjects :");
            noOfSub=sc.nextInt();
            System.out.println("\n*********************************************************************\n");
            
            System.out.println("Enter "+noOfSub+" Subject Student Marks :");
            marks=new int[noOfSub];
            for(int i=0;i<noOfSub;i++){
                marks[i] = sc.nextInt();
            }
            
           while(flag){ 
            System.out.println("\n*********************************************************************\n");
            System.out.println("1. Display All Marks :");
            System.out.println("2. Display Total Marks :");
            System.out.println("3. Display Average :");
            System.out.println("4. Exit From Application :");
            System.out.println("\n*********************************************************************\n");
            
            System.out.println("Enter Your Choice :");
            int ch = sc.nextInt();
            System.out.println("\n*********************************************************************\n");
            
            switch(ch){
                case 1:
                    displayMarks();
                    break;
                    
                case 2:
                    displayTotalMarks();
                    break;
                    
                case 3:
                    displayAverage();
                    break;
                    
                case 4:
                    exit();
                    break;
                    
                    default:
                        System.out.println("Please Enter Valid Choice !!!");
                    
            }
            
            
        }
        
    }
    
}
