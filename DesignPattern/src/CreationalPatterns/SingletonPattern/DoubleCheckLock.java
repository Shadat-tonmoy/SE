package CreationalPatterns.SingletonPattern;

public class DoubleCheckLock
{
    //here volatile ensures that while using multi-threading, multiple thread access the instance correctly
    private volatile static DoubleCheckLock instance;

    //private constructor
    private DoubleCheckLock()
    {
    }

    public static DoubleCheckLock getInstance()
    {
        //single check
        if(instance==null)
        {
            synchronized (DoubleCheckLock.class)
            {
                //double check
                if(instance==null)
                {
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }

}
