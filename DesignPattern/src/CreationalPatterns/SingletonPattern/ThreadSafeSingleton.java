package CreationalPatterns.SingletonPattern;

public class ThreadSafeSingleton
{
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton()
    {

    }

    //synchronization is a costly operation. In order to make it more efficient we should use Double-Check lock mechanism
    public synchronized static ThreadSafeSingleton getInstance()
    {
        if(instance==null)
            instance = new ThreadSafeSingleton();
        return instance;
    }


}
