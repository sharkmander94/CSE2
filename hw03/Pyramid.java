import java.util.Scanner;
 
//This is a program to calculate the volume of a pyramid based on user inputs
public class Pyramid{
    public static void main(String[] args){
        //Declare the varables
        double sideLength;
        double height;
        double volume;
        Scanner myScanner=new Scanner(System.in);
        
        //Get the input
        System.out.println("What is the length of one side of the base?");
        sideLength=myScanner.nextDouble();
        System.out.println("How tall in the pyramid?");
        height=myScanner.nextDouble();
        
        //Calculate volume
        volume=(sideLength*sideLength*height)/3;
        
        //Display result
        System.out.println("The pyramid's volume is " + volume);
    }
}