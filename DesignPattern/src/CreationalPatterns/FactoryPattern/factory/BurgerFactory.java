package CreationalPatterns.FactoryPattern.factory;

import CreationalPatterns.FactoryPattern.model.burger.BeefBurger;
import CreationalPatterns.FactoryPattern.model.burger.Burger;
import CreationalPatterns.FactoryPattern.model.burger.CheeseBurger;
import CreationalPatterns.FactoryPattern.model.burger.VegetableBurger;

public class BurgerFactory
{
    public Burger prepareBurger(int burgerType, int unit)
    {
        switch (burgerType)
        {
            case 1:
                return new CheeseBurger(unit);
            case 2:
                return new VegetableBurger(unit);
            case 3:
                return new BeefBurger(unit);
        }
        return null;
    }
}
