 interface Movie  {
    public void Fight();
    public void Comedy();
}

public class Interface implements Movie {
    public void Fight(){
        System.out.println("Salar");
    }
    public void Comedy(){
        System.out.println("Raju Gari Gadhi1" );
    }
    public static void main(String[] args) {
        Interface I=new Interface();
        I.Fight();
        I.Comedy();
    }
}
