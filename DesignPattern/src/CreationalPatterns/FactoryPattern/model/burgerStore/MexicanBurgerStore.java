package CreationalPatterns.FactoryPattern.model.burgerStore;

import CreationalPatterns.FactoryPattern.model.burger.Burger;
import CreationalPatterns.FactoryPattern.model.burger.MexicanBeefBurger;
import CreationalPatterns.FactoryPattern.model.burger.MexicanCheeseBurger;
import CreationalPatterns.FactoryPattern.model.burger.MexicanVegetableBurger;

import static CreationalPatterns.FactoryPattern.constants.*;

public class MexicanBurgerStore extends BurgerStore
{
    public MexicanBurgerStore()
    {
        storeName = "Mexican Burger Store";
    }

    @Override
    public Burger orderBurger(int burgerType, int burgerUnit)
    {
        switch (burgerType)
        {
            case MEXICAN_CHEESE_BURGER:
                return new MexicanCheeseBurger(burgerUnit);
            case MEXICAN_BEEF_BURGER:
                return new MexicanBeefBurger(burgerUnit);
            case MEXICAN_VEGETABLE_BURGER:
                return new MexicanVegetableBurger(burgerUnit);
        }
        return null;
    }
}
