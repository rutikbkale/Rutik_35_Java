
import java.util.Scanner;

class Flat {

    int flatno;
    String ownnerName, a;
    String HouseType;
    int tax, rent;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flat No : ");
        flatno = sc.nextInt();
        System.out.println("Enter Ownner Name : ");
        a = sc.nextLine();
        ownnerName = sc.nextLine();
        System.out.println("Enter House Type(ownner/tenant) : ");
        HouseType = sc.nextLine();

        if (HouseType.equals("ownner")) {
            tax = 5;
        } else if (HouseType.equals("tenant")) {
            tax = 10;
            System.out.println("Enter Rent : ");
            rent = sc.nextInt();

        } else {
            System.out.println("Please Enter valid input !");
        }
    }

}
