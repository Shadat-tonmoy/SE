package CreationalPatterns.FactoryPattern.model.burger;

public class CheeseBurger extends Burger
{

    public CheeseBurger(int unit)
    {
        burgerName = "CheeseBurger";
        burgerPrice = 120;
        this.burgerUnit = unit;
    }


}
