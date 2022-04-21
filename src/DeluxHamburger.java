/**
 * @author ak-chelibashki
 */
import java.text.DecimalFormat;

public class DeluxHamburger extends Hamburger  {

    /**
     * Class instances
     */
    private String additions[] ={"Chips","Soft Drink"};
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    /**
     * default class constructor
     */
    public DeluxHamburger() {
        super();
    }//end constructor

    /**
     * overloaded constructor to accept base price for object
     * @param price
     */
    public DeluxHamburger(double price) {
        super(price);
    }//end constructor

    /**
     * overloaded constructor
     * @param bread
     * @param meat
     * @param burgerPrice
     */
    public DeluxHamburger(String bread, String meat, double burgerPrice) {
        super(bread,meat,burgerPrice);

    }//end constructor


    /**
     * method to display additions options in console
     */
    public void displayAdditions() {
        //System.out.println("This burger comes with two additions: ");
        for(String addition : additions) {
            System.out.print(addition+" ");
        }//end for/each
    }//end method

    /**
     * calculate total amount in additions
     * @return
     */
    public double calculateAdditions() {
        double totalADditions;
        totalADditions = (additions.length * this.getAdditionsPrice());

        return totalADditions;
    }//end method

    /**
     * calculate total price of hamburger
     * @return
     */
    public String totalHamburgerPrice() {
        double total;

        total = calculateAdditions() * getBasePrice();
        String line = ""+df2.format(total);

        return line;
    }//end class

}//end method
