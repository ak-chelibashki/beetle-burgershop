/**
 * @author ak-chelibashki
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BurgerShopDriver {

    /**
     * Class instances
     */
    private static Scanner in;
    private static Scanner in2;

    public static void main(String[] args) {

        openMenu();

    }//end main

    /**
     * Method to generate user menu to select option
     * from the restaurant menu
     */
    static void openMenu() {
        in = new Scanner(System.in);
        int userChoice = 0;
        userChoice = makeSelection();

        if(userChoice >0 || userChoice <= 3) {
            if(userChoice == 1) {
                //initialize SignatureBurger object
                SignatureBurger sigHam1 = new SignatureBurger(2.0);
                sigHam1.setAdditionPrice(0.5);
                //take user input
                System.out.println("Choose type of bread :   Italian style\t Wheate bread");
                sigHam1.setMeatType(in.nextLine());
                System.out.println("Choose type of meat : Beef\tChicken");;
                sigHam1.setRollType(in.nextLine());

                //display additions in console
                // take user input
                //and calculate total order price
                sigHam1.displayAdditions();
                sigHam1.chooseAdditions();
                String line = sigHam1.toString();
                System.out.println(""+line+"\nTotal Hamburger Price: £"+(sigHam1.getBasePrice()+sigHam1.calculateAdditions()));


            }//end if
            else if( userChoice == 2) {
                ButtermilkBurger bmHam1 = new ButtermilkBurger(1.90);
                bmHam1.setAdditionPrice(0.5);
                System.out.println("Choose type of bread :   Italian style\t Wheate bread");
                bmHam1.setMeatType(in.nextLine());
                System.out.println("Choose type of meat : Beef\tChicken");
                bmHam1.setRollType(in.nextLine());

                bmHam1.displayAdditions();
                bmHam1.chooseAdditions();
                String line = bmHam1.toString();
                System.out.println(""+line+"\nTotal Hamburger Price: £"+(bmHam1.getBasePrice()+bmHam1.calculateAdditions()));
            }
            else if( userChoice == 3) {
                DeluxHamburger dxHam1 = new DeluxHamburger(2.00);
                dxHam1.setAdditionPrice(1.00);
                System.out.println("Choose type of bread :   Italian style\t Wheate bread");
                dxHam1.setRollType(in.nextLine());
                System.out.println("Choose type of meat : Beef\tChicken");
                dxHam1.setMeatType(in.nextLine());
                dxHam1.displayAdditions();
                //String total =" "+ dxHam1.totalHamburgerPrice();
                System.out.println(dxHam1.toString()+"\nTotal Hamburger Price: £"+(dxHam1.getBasePrice()+dxHam1.getAdditionPrice()));
            }
            else {
                System.exit(0);
            }
        }//end if
        in.close();

    }//end method

    /**
     * method to display user selection in console
     * invokes selectFromMenu method
     * return the output of selectFromMenu
     */
    static int makeSelection() {
        //initialize local instances
        int select = 0, option1 = 1, option2 = 2, option3 = 3, option4 = 4;


        //validate user input and make selection from the menu
        do {
            try {
                select = selectFromMenu();
                if (select == option1 ) {
                    System.out.println("Signature Burger - base price £2 any addition £0.50");
                }
                else if(select == option2) {
                    System.out.println("Buttermilk Burger - base price £1.90 any addition £0.50");
                }
                else if(select == option3) {
                    System.out.println("Deluxe Burger - base price £2.00 automatically comes with any Soft Drink and Chips for extra £1!");
                }
                else if(select == option4) {
                    System.out.println("Exit!");
                    System.exit(0);
                }
                else {
                    System.out.println("Input out of range! (Range 1 - 4)");
                }//end else
            }catch(InputMismatchException e) {
                System.out.println("Error 1! Invalid Input!");
            }//end try/catch
        }while(select ==0 || select > 4);//end do/while


        return select;
    }//end method

    /**
     * Method to allow the user to make selection from the menu
     */
    static int selectFromMenu() {
        //initisialize local instances
        int selection = 0 ;
        String message = "", message2 = "";
        in2 = new Scanner(System.in);

        //generate and print menu options
        message = "Please choose an option from the menu: ";
        message2 = "1.Signature Burger\t2.Buttermilk Burger\t3.Deluxe Burger\t4.Exit";

        System.out.println(message+"\n"+message2);

        //take user input
        selection = in2.nextInt();
        in2.close();

        return selection;
    }//end method

}//end class
