package CreationalPatterns.FactoryPattern.model.burgerStore;

import CreationalPatterns.FactoryPattern.model.burger.Burger;
import CreationalPatterns.FactoryPattern.model.burger.IndianBeefBurger;
import CreationalPatterns.FactoryPattern.model.burger.IndianCheeseBurger;
import CreationalPatterns.FactoryPattern.model.burger.IndianVegetableBurger;

import static CreationalPatterns.FactoryPattern.constants.*;

public class IndianBurgerStore extends BurgerStore {

    public IndianBurgerStore()
    {
        storeName = "Indian Burger Store";
    }

    @Override
    public Burger orderBurger(int burgerType, int burgerUnit)
    {
        switch (burgerType)
        {
            case INDIAN_CHEESE_BURGER:
                return new IndianCheeseBurger(burgerUnit);
            case INDIAN_VEGETABLE_BURGER :
                return new IndianVegetableBurger(burgerUnit);
            case INDIAN_BEEF_BURGER:
                return new IndianBeefBurger(burgerUnit);
        }
        return null;
    }
}
