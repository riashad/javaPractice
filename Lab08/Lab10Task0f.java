import java.util.*;
import java.io.*;

public class Lab10Task0f {
  public static void main(String [] args) {
     int sum=0;
    try
    {
    
    Scanner k =new Scanner(new File("f:\\Lab08\\a.txt")); 
    System.out.println("Please Enter 3 number");
    String ektaLine;
    int a;
    int d;
   
    
    for(int i=0; i<3; i++){
      
      ektaLine=k.nextLine();
      a=Integer.parseInt(ektaLine);
      a=Integer.parseInt(ektaLine);
      sum+=a;
    }
    }
    catch( Exception e)
    {
       System.out.println(e);
    }
    System.out.println(sum);
    
  }
}
