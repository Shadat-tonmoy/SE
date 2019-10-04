package CreationalPatterns.SingletonPattern;

import java.util.Scanner;

public class Client
{
    public static void main(String args[])
    {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        int firstObjectHashId = lazySingleton.hashCode();
        LazySingleton anotherLazySingleton = LazySingleton.getInstance();
        int anotherObjectHashId = anotherLazySingleton.hashCode();
        if(firstObjectHashId == anotherObjectHashId)
            System.out.println("The objects are same");
        else System.out.println("These objects are not same");
        int objectCreationFlag = 1;
        int exitFlag = -1;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int inputFlag = scanner.nextInt();
            if(inputFlag==exitFlag)
            {
                System.out.println("Ending Up....");
                break;
            }
            if(inputFlag==objectCreationFlag)
            {
                LazySingleton singleton = LazySingleton.getInstance();
            }
        }


    }
}
