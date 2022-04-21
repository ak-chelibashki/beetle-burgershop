/**
 * @author ak-chelibashki
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ButtermilkBurger extends Hamburger{

    /**
     * Class constructor
     */
    private String additions[] ={"Garlic Mayo","Relish","Cheese"};
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private int numberOfAdditions;

    /**
     * Default class constructor
     */
    public ButtermilkBurger() {
        super();
    }//end constructor

    /**
     * overloaded constructor to accept base price for object
     * @param price
     */
    public ButtermilkBurger(double price) {
        super(price);
    }//end constructor

    /**
     * Construcotr passing parameters to assign to attributes
     * @param bread
     * @param meat
     * @param burgerPrice
     */
    public ButtermilkBurger(String bread, String meat, double burgerPrice) {
        super(bread,meat,burgerPrice);
    }//end overloaded counstructor

    /**
     *method to display additions options in console
     */
    public void displayAdditions() {
        System.out.println("Yoy can choose any of those additions");
        for(String addition : additions) {
            System.out.print(" "+addition);
        }//end for/each
    }//end method


    /**
     * take user input for additions
     * untill user input equal to 'enter'
     * or number of additions equals to 4
     * display number of additions
     * and what was added to the hamburger
     */
    public void chooseAdditions() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> userChoice;
        userChoice = new ArrayList<String>();
        String addition = "";


        do {
            System.out.println("\n\nType in your choice (once you are ready with your choice type in 'Enter') : ");
            addition = in.nextLine();

            if(addition.equals("enter") || addition.equals("Enter") || addition.equals("ENTER"))
                break;
            userChoice.add(numberOfAdditions, addition);;
            numberOfAdditions++;
        }while(!addition.toUpperCase().equals("ENTER") || this.numberOfAdditions != 3);

        System.out.println("Number of additions " + numberOfAdditions);

        System.out.println("Your additions : ");

        for(int i = 0; i< numberOfAdditions; i++) {
            System.out.println(userChoice.get(i));
        }
        in.close();

    }//end method

    /**
     * calculate total amount in additions
     */
    public double calculateAdditions() {
        double totalADditions;
        totalADditions = (this.numberOfAdditions * this.getAdditionsPrice());
        System.out.println("Total extra in additions to this burger: £" + totalADditions);
        return totalADditions;
    }//end method

    /**
     * calculate total price of hamburger
     */
    public String totalHamburgerPrice() {
        double total;

        total = calculateAdditions() * getBasePrice();
        String line = ""+df2.format(total);

        return line;
    }//end class

    /**
     * retrieve number of additions
     * @return
     */
    public int getAdditionsCount() {
        return numberOfAdditions;
    }//end method
}//end
