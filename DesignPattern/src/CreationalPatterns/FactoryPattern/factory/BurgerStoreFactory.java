package CreationalPatterns.FactoryPattern.factory;

import CreationalPatterns.FactoryPattern.model.burgerStore.BurgerStore;
import CreationalPatterns.FactoryPattern.model.burgerStore.IndianBurgerStore;
import CreationalPatterns.FactoryPattern.model.burgerStore.MexicanBurgerStore;

import static CreationalPatterns.FactoryPattern.constants.INDIA_REGION;
import static CreationalPatterns.FactoryPattern.constants.MEXICO_REGION;

public class BurgerStoreFactory
{
    public BurgerStore getBurgerStore(int region)
    {
        switch (region)
        {
            case INDIA_REGION:
                return new IndianBurgerStore();
            case MEXICO_REGION:
                return new MexicanBurgerStore();
        }
        return null;
    }

}
