import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class File_handling 
{
    public static void main(String[] args) 
    {
        try{
            BufferedReader slide=new BufferedReader(new FileReader("Unknown.java"));
            String Line;
            while((Line=slide.readLine())!=null){
                System.out.println(Line);
            }
            slide.close();
        }catch(Exception e){
            System.out.println(e);
        }





        /* try 
        {
            BufferedWriter pen = new BufferedWriter(new FileWriter("Unknown.java"));
            pen.write("public class Unknown{");
            pen.newLine();
            pen.write("pblic static void main(String[] args(){");
            pen.newLine();
            pen.write("System.out.println(num+num2)");
            pen.newLine();
            pen.newLine();
            pen.write("}}"); 
            pen.close();   
        } catch (Exception e) {
            System.out.println(e);
        } */
        
    }    
}
//File Append
/*import java.io.File;

public class File_handling {
    public static void main(String[] args) {
        try{
        File Data=new File("Sample.java");
         Data.createNewFile();
       System.out.println(Data.getAbsolutePath());
       System.out.println(Data.canRead());
       System.out.println(Data.getName());
       System.out.println(Data.canExecute());
       System.out.println(Data.canWrite());
        
       Data.delete();

    


        }catch(Exception e){
            System.out.println(e);
        }
    }
}*/
