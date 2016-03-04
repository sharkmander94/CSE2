import java.util.Scanner;

public class test{
    public static void main(String[] args){
       boolean test=false;
       Scanner myScanner= new Scanner(System.in);
       
        while(test==false){
            test=myScanner.hasNextInt();
            if(test==false){
                myScanner.next();
            }
            System.out.println(test);
            
        }
        System.out.println("yay");
    }
}