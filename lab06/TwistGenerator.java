//creates a helix-like design in the console that is a length specified by the user
import java.util.Scanner;

public class TwistGenerator{
    public static void main(String[] args){
        //define variables
        int length=0; //user input
        boolean test=false; //used for testing values
        Scanner myScanner= new Scanner(System.in);
        
        System.out.println("How long (# of characters) would you like the twist to be? ");
        
        //Continue to ask for an input until an acceptable value is input
        while(test==false){ 
            //Check to make sure the input is an integer
            test=myScanner.hasNextInt();
            if(test== false){
                System.out.println("Please input an integer value.");
                myScanner.next();
            }
            else{
                length=myScanner.nextInt();
                //Check to make sure the input is positive
                if(length >= 0){
                    test=true;
                }
                else{
                    System.out.println("Please input a positive number.");
                    myScanner.next();
                }
            }
        }
        
        //Print the twist
        for(int i=0; i<3; i++){
            //System.out.println(i);
            for(int j=0; j< length; ){
                //System.out.println(j);
                if(i==0){
                    for(int k=0;k<3 && j<length;k++){
                        switch(k){
                            case 0:
                                System.out.print("\\");
                                break;
                            case 1:
                                System.out.print(" ");
                                break;
                            case 2:
                                System.out.print("/");
                                break;
                            default:
                                break;
                        }
                        j++;
                    }
                }
                else if(i==2){
                    for(int k=0;k<3 && j<length;k++){
                        switch(k){
                            case 0:
                                System.out.print("/");
                                break;
                            case 1:
                                System.out.print(" ");
                                break;
                            case 2:
                                System.out.print("\\");
                                break;
                            default:
                                break;
                        }
                        j++;
                    }
                }
                else{
                    for(int k=0;k<3 && j<length;k++){
                        switch(k){
                            case 0:
                                System.out.print(" ");
                                break;
                            case 1:
                                System.out.print("X");
                                break;
                            case 2:
                                System.out.print(" ");
                                break;
                            default:
                                break;
                        }
                        j++;
                    }
                }
                
            }
            System.out.println("");
        }
    }
    
}