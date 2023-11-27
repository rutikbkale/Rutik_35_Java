
import java.util.Scanner;


public class Ass9{
	public static void main(String[] args) {
        FlatRent obj = new FlatRent();
        obj.getInput();
        double toPayTax = obj.calTax();
        System.out.println("Total tax : " + toPayTax);

    }

}

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

class FlatRent extends Flat {

    public double calTax() {
        int rent = 5000;
        int tax = super.tax;
        String HouseType = super.HouseType;
        if (HouseType.equals("tenant")) {
            rent = super.rent;
        }
        double toPayTax;
        toPayTax = ((rent * 12) * tax) / 100;
        return toPayTax;
    }

   
}


