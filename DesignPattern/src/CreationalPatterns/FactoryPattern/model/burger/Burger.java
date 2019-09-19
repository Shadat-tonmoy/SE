package CreationalPatterns.FactoryPattern.model.burger;

//also following the template pattern
public abstract class Burger
{
    protected String burgerName;
    protected double burgerPrice;
    protected int burgerUnit = 1;

    public String getBurgerDetails()
    {
        return "Burger Name : "+getBurgerName()
                +"\nBurger Price : "+getBurgerPrice()
                +"\nBurger Unit : "+getBurgerUnit()
                +"\nTotal Price : "+calculatePrice();
    }

    private double calculatePrice()
    {
        return getBurgerPrice() * getBurgerUnit();
    }

    private String getBurgerName() {
        return burgerName;
    }

    private double getBurgerPrice() {
        return burgerPrice;
    }

    private int getBurgerUnit() {
        return burgerUnit;
    }
}
