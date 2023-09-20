public class Ass9{
	public static void main(String[] args) {
        FlatRent obj = new FlatRent();
        obj.getInput();
        double toPayTax = obj.calTax();
        System.out.println("Total tax : " + toPayTax);

    }

}