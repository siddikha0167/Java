import java.util.Scanner;
import java.io.*;

public class Exception_Handling {
    static void readFile() throws IOException{
        FileReader fr= new FileReader("Patter.java");
        System.out.println("File Opened");
        }
    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println("Something went wrong");
        }
        
        
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Not Eligible to vote");
        }
        System.out.println("The person can vote");*/

        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt(); 
       System.out.print("Enter a number");
        int num1=sc.nextInt();
      
        try{
            System.out.println("The Division value of number is : "+(num/num1));
        }
        catch(ArithmeticException e){
            System.out.println("No number can divided by 0");
            System.out.print("Enter a number:");
            num=sc.nextInt();
            System.out.print("Enter a number");
            num1=sc.nextInt();
            System.out.println("The Division value of number is : "+(num/num1));
        }
        finally{
            System.out.println("Program Exacuted Successfully");
        }*/
    }
}
