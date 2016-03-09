//Generates a Fibonacci sequence of a chosen length based on user input

//import required classes
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        //declare varables to hold values
        int a1=0;
        int a2=0;
        int sum=0;
        int numberOfTerms=2;
        //These variables serve as placholders for calculations
        boolean test=false;
        int placeholder=2;
        Scanner myScanner=new Scanner(System.in);
        
        //Run through and test each input
        for(int i=0;i<3;i++){
            //Reset the test parameter
            test=false;
            
            //Choose correct question to ask
            switch(i){
                case 0:
                    System.out.println("Input the first term");
                    break;
                case 1:
                    System.out.println("Input the second term");
                    break;
                case 2:
                    System.out.println("Input the desired number of terms");
                    break;
                default:
                    break;
            }
            //Check that the input follows all guidlines
            while(test==false){ 
                //Check to make sure the inputs are integer
                test=myScanner.hasNextInt();
                if(test== false){
                    System.out.println("Please input an integer value.");
                    myScanner.next();
                }
                else{
                    placeholder=myScanner.nextInt();
                    //Check to make sure the input is positive
                    if(placeholder >= 0){
                        //Assign input to correct variable
                        switch(i){
                            case 0:
                                a1=placeholder;
                                break;
                            case 1:
                                a2=placeholder;
                                break;
                            case 2:
                                numberOfTerms=placeholder;
                                break;
                            default:
                                break;
                        }
                        //Set test to true to break out of loop
                        test=true;
                    }
                    else{
                        System.out.println("Please input a positive number.");
                        test=false;
                    
                    }
                }
            }
        }
        //Print first term if user input greater than 0 terms
        if(numberOfTerms>0){
            System.out.print(a1);
        }
        //Print out sarcastic message if user input 0
        else{
            System.out.println("This is what 0 terms looks like:   .");
        }
        //Print out second term
        if(numberOfTerms>1){
            System.out.print(","+a2);
        }
        //Print out the rest of the terms
        for(int i=0; i<(numberOfTerms-2);i++){
            //add last and first before last terms
            sum=a1+a2;
            //move term varibles up in the sequence
            a1=a2;
            a2=sum;
            //Print out current term
            System.out.print(","+sum);
        }
        //Print period if necessary
        if(numberOfTerms>0){
            System.out.print(".\n");
        }
    }
}