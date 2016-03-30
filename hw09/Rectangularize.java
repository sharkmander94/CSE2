//takes an input and uses a different method depending on its type (basically a pointless excercise to show overloading)
import java.util.Scanner;

public class Rectangularize{
    //create scanner object
    static Scanner myScanner=new Scanner(System.in);
    
    //string method
    public static void Rectangle(String input){
        //print input word a number of times equal to its length
        for(int i=input.length();i>1;i--){
            System.out.println(input);
        }
    }
    //integer method
    public static void Rectangle(int input){
        //decides number of lines
        for(int i=input;i>0;i--){
            //decides number of % symbols per line
            for(int j=input;j>0;j--){
            System.out.print("%");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        //run the methods
        System.out.println("Input either a string or integer to be rectangularized");
        if(myScanner.hasNextInt()==true){
            Rectangle(myScanner.nextInt());
        }
        else{
            Rectangle(myScanner.nextLine());
        }
    }
}