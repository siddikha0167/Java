import java.util.Scanner;

abstract class Subjects{
    int marks; 
    abstract void Maths();
    void Score(){
        Scanner get=new Scanner(System.in);
        System.out.print("Enter ur score:");
        marks=get.nextInt();
    }
}
class std1 extends Subjects{
    void Maths(){
        System.out.println("Numbers");
        Score();
    }
    void display(){
        System.out.println("MArks in std1 : " +marks);
    }
}
class std2 extends Subjects{
    void Maths(){
        System.out.println("Arethematic Operation");
        Score();
    }
    void display(){
        System.out.println("MArks in std2 : " +marks);
    }
}

public class Abstract {
    public static void main(String[] args) {
        std1 s=new std1();
        s.Maths();
        s.display();
        std2 s1=new std2();
        s1.Maths();
        s1.display();
    }
}
