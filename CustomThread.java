public class CustomThread extends Thread{

    public CustomThread(String name) {
        this.setName(name);
    }
    @Override
    public synchronized void  run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(this.getName() + "is running with priority" + this.getPriority());
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(this.getName() + "was interrupted");
        }
    }
    
}
