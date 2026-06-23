class Process extends Thread
{
    public void run()
    {
        for (int i = 1; i < 5; i++) 
        {
            System.out.println("Laps:"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }    
        }
    }
}
class Process2 extends Thread {
    public void run(){
        for (int i = 1; i < 13; i++) 
        {
            System.out.println("HeadCount:"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }
    }
}
public class Multithread_abstract 
{
    public static void main(String[] args) throws InterruptedException
    {
        Process P = new Process();
        Process2 P2=new Process2();
        P.setPriority(Thread.MIN_PRIORITY);// then next
        P2.setPriority(Thread.MAX_PRIORITY);// starts first
        P.start();
        P2.start();
        /*System.out.println(P.isAlive());
        P.join();
        for (int i = 1; i < 13; i++) 
        {
            System.out.println("HeadCount:"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(P.isAlive());
        }*/
        Thread.sleep(2000);
        
    }    
}