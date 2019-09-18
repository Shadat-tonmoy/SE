package CreationalPatterns.FactoryPattern.controller;

import CreationalPatterns.FactoryPattern.model.BeefBurger;
import CreationalPatterns.FactoryPattern.model.Burger;
import CreationalPatterns.FactoryPattern.model.CheeseBurger;
import CreationalPatterns.FactoryPattern.model.VegetableBurger;

import java.util.Scanner;

public class BurgerSupplier
{
    public static void main(String args[])
    {
        String burgerType;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Burger Type\n Press 1 For Cheese Burger\n Press 2 For Vegetable Burger\n Press 3 For Beef Burger");
        int type = scanner.nextInt();
        System.out.println("Enter the quantity of burger");
        int unit = scanner.nextInt();
        Burger burger = null;
        switch (type)
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
        }
        System.out.println("Your Order Details\n"+burger.getBurgerDetails());


    }
}
