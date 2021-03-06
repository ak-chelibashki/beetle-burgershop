public class Hamburger {

    /**
     * class instances
     */
    private String rollType;
    private String meatType;
    private double baseBurgerPrice;
    private double singleAdditionPrice = 0.10;

    /**
     * Default constructor
     */
    public Hamburger() {
        this.rollType = null;
        this.meatType = null;
        this.baseBurgerPrice = 1;

    }//end constructor

    /**
     * overloaded constructor accept base burger price as parameter
     * @param price
     */
    public Hamburger(double price) {
        this.rollType = null;
        this.meatType = null;
        this.baseBurgerPrice = price;
    }//end constructor

    /**
     * Constructor assign paramaters to class attributes
     * @param bread
     * @param meat
     * @param price
     */
    public Hamburger(String bread, String meat, double price) {

        this.rollType = bread;
        this.meatType = meat;
        this.baseBurgerPrice = price;

    }//end overloaded constructor

	/*
	 //abstract method to be inherited by child classes
	public abstract void displayAdditions(String[] additions);
	public abstract String chooseAddition();
	public abstract double calculateAdditions(int numAdditions, double price);
	public abstract String toString();
	public abstract void setBasePrice();
	*/

    /**
     * Method to update base price
     * @param price
     */
    public void setBasePrice(double price) {
        this.baseBurgerPrice = price;
        System.out.println(this.baseBurgerPrice);
    }//end method

    /**
     * Method to update meat type
     * @param meat
     */
    public void setMeatType(String meat) {
        this.meatType = meat;
    }//end method

    /**
     * Method to update roll type
     * @param roll
     */
    public void setRollType(String roll) {
        this.rollType = roll;
    }//end method

    /**
     * Method to add additions price to the total bill
     * @param price
     */
    public void setAdditionsPrice(double price) {
        this.singleAdditionPrice = price;
    }//end method

    /**
     * Method to retrieve base price
     * @return
     */
    public double getBasePrice() {
        return this.baseBurgerPrice;
    }//end method

    /**
     * Method to retrieve roll type
     * @return
     */
    public String getRollType() {
        return this.rollType;
    }//end method

    /**
     * Method to retrieve meat type
     * @return
     */
    public String getMeatType() {
        return this.meatType;
    }//end method

    /**
     * Method to retrieve additions price
     * @return
     */
    public double getAdditionsPrice() {
        return this.singleAdditionPrice;
    }//end method

    /**
     * Method to retrieve single addition price
     * @return
     */
    public double getAdditionPrice() {
        return this.singleAdditionPrice;
    }//end method

    /**
     * Method to update single addition price
     * @param price
     */
    public void setAdditionPrice(double price) {
        this.singleAdditionPrice = price;
    }//end method

    /**
     * Overloaded method to generate string
     * from data generated by the user
     * @return
     */
    public String toString() {
        String line;
        line = "Bread type: "+this.rollType
                +"\nMeat type: "+this.meatType
                +"\nBase price: ??"+this.baseBurgerPrice
                +"\nAddition price: ??"+this.singleAdditionPrice;
        return line;
    }//end method
}//end class
