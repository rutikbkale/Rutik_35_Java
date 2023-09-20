
public class FlatRent extends Flat {

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
