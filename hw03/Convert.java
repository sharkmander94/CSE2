//This is a program that takes user inputted meter values and conerts them to inches
import java.util.Scanner;

public class Convert{
    public static void main(String[] args){
        //Declare variables to hold the values
        double input=0;
        double result=0;
        //Create Scanner to read inputs
        Scanner myScanner=new Scanner(System.in);
        
        //Recieve inputs
        System.out.println("Input value in meters: ");
        input= myScanner.nextDouble();
        
        //Convert from meters to inches
        result=input*39.3701;
        
        //Print result
        System.out.println("Input value: "+ input + " meters.");
        System.out.println("Converted value "+ result + " inches.");
    }
}