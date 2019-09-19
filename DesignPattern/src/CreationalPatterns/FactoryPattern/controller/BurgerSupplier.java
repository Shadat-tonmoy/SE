package CreationalPatterns.FactoryPattern.controller;

import CreationalPatterns.FactoryPattern.factory.BurgerFactory;
import CreationalPatterns.FactoryPattern.factory.BurgerStoreFactory;
import CreationalPatterns.FactoryPattern.model.burger.Burger;
import CreationalPatterns.FactoryPattern.model.burgerStore.BurgerStore;

import java.util.Scanner;

public class BurgerSupplier
{
    public static void main(String args[])
    {
        String burgerType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Your Region\n Press 1 For India\nPress 2 For Mexico");
        int region = scanner.nextInt();
        BurgerStoreFactory burgerStoreFactory = new BurgerStoreFactory();
        BurgerStore burgerStore = burgerStoreFactory.getBurgerStore(region);
        System.out.println("Choose Burger Type\n Press 1 For Cheese Burger\n Press 2 For Vegetable Burger\n Press 3 For Beef Burger");
        int type = scanner.nextInt();
        System.out.println("Enter the quantity of burger");
        int unit = scanner.nextInt();
        Burger burger = null;

        // refactored into factory pattern
        /*switch (type)
        {
            case 1:
                burger = new CheeseBurger(unit);
                break;
            case 2:
                burger = new VegetableBurger(unit);
                break;
            case 3:
                burger = new BeefBurger(unit);
                break;
        }*/


        /*BurgerFactory burgerFactory = new BurgerFactory();*/
        burger = burgerStore.orderBurger(type,unit);
        System.out.println("Your Order Details\n"+burger.getBurgerDetails());


    }
}
