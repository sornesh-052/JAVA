class athread extends Thread
{
    public void run()
    {
        setPriority(Thread.MIN_PRIORITY);

        try
        {
            for(int i = 1; i<=5; i++)
            {
                System.out.println(i+" X 5 = "+i*5);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Exiting A Thread");
    }
}
class bthread extends Thread
{
    public void run()
    {
        setPriority(Thread.MAX_PRIORITY);

        try
        {
            for(int i = 1; i<=5; i++)
            {
                System.out.println(i+" X 9 = "+i*9);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Exiting B Thread");
    }
}
class multithreadtest
{
    public static void main(String arg[])
    {
        athread a = new athread();
        bthread b = new bthread();
        a.start();
        b.start();
    }
}
