package CreationalPatterns.FactoryPattern.model;

public class VegetableBurger extends Burger
{

    public VegetableBurger(int unit)
    {
        burgerName = "VegetableBurger";
        burgerPrice = 80;
        this.burgerUnit = unit;
    }


}
