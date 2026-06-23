class Process extends Thread  {
    public void run(){
        for (int i=1;i<5;i++){
            System.out.println("Laps"+i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}

public class Multithread {
    public static void main(String[] args) {
        Process p=new Process();
        p.start();
         for (int i=1;i<5;i++){
            System.out.println("Count"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
