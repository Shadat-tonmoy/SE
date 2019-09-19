package CreationalPatterns.FactoryPattern.model.burgerStore;

import CreationalPatterns.FactoryPattern.model.burger.Burger;

public abstract class BurgerStore
{
    protected String storeName;

    private String getStoreName()
    {
        return storeName;
    }

    public abstract Burger orderBurger(int burgerType, int burgerUnit);
}
