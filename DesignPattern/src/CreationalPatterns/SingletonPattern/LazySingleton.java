package CreationalPatterns.SingletonPattern;

public class LazySingleton
{
    private static LazySingleton instance;
    //this will turn it into a eager creation of singleton pattern
//    private static LazySingleton instance = new LazySingleton();
    private static int numberOfObjectCreation = 0;

    private LazySingleton()
    {

    }

    public static LazySingleton getInstance()
    {
        numberOfObjectCreation++;
        if(numberOfObjectCreation>5)
        {
            System.out.println("You have reached the limit of object creation");
        }
        else System.out.println("Singleton Delivered");
        if(instance==null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }

}
