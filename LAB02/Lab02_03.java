import java.util.*;
public class Lab02_03{
  public static void main(String []args){
    
    Scanner k= new Scanner(System.in);
    
    System.out.println("Please enter a value");
    int a=k.nextInt();
       
    for(int i=1; i<=a;i++){
      for(int j=1; j<=i;j++){
        
        System.out.print("*");
      }
       System.out.println(" ");
    }
   
  }
}

