class kill implements Runnable{
    public void run(){
        while(true){
            System.out.println("Daemon Slayer");
        }
    }
}

public class Daemon {
    public static void main(String[] args) throws InterruptedException{
        kill k=new kill();
        Thread t=new Thread(k);
        t.setDaemon(true);
        t.sleep(1000);
        t.start();
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
    }
}
