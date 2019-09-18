package CreationalPatterns.FactoryPattern.factory;

import CreationalPatterns.FactoryPattern.model.BeefBurger;
import CreationalPatterns.FactoryPattern.model.Burger;
import CreationalPatterns.FactoryPattern.model.CheeseBurger;
import CreationalPatterns.FactoryPattern.model.VegetableBurger;

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
