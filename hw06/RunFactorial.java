//A simple calculator that takes the factorial of number 9 to 16

//import required classes
import java.util.Scanner;

public class RunFactorial{
    public static void main(String[] args){
        //declare varables to hold values
        int input=9;
        int factorial=1;
        boolean test=false;
        Scanner myScanner=new Scanner(System.in);
        
        System.out.println("Input a integer between 9 and 16:");
        while(test==false){ 
            //Check to make sure the input is an integer
            test=myScanner.hasNextInt();
            if(test== false){
                System.out.println("Please input an integer value.");
                myScanner.next();
            }
            else{
                input=myScanner.nextInt();
                //Check to make sure the input is between 9 and 16
                if(input >= 9 && input<= 16){
                    test=true;
                }
                else{
                    System.out.println("Please input an integer between 9 and 16.");
                    test=false;
                    
                }
            }
        }
        //caculate the factorail
        for(int i=input;i>0;i--){
            factorial=factorial*i;
        }
        //print the result
        System.out.println(input+"! = "+factorial);
    }
}