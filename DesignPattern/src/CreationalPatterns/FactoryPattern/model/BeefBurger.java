package CreationalPatterns.FactoryPattern.model;

public class BeefBurger extends Burger
{

    public BeefBurger(int unit)
    {
        burgerName = "BeefBurger";
        burgerPrice = 80;
        this.burgerUnit = unit;
    }


}
