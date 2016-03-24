//creates a helix-like design based on user input length and width
import java.util.Scanner;

public class Twisty{
    public static void main(String[] args){
        //define variables
        int length=0; //user input
        int width=0; //user input
        int placeholder=0; // stores rounded down half of width
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
                if(length >= 0 && length <=80){
                    test=true;
                }
                else{
                    System.out.println("Please input a positive number less than 80.");
                    test=false;
                    
                }
            }
        }
        test=false;
        
        System.out.println("How wide (# of characters) would you like the twist to be? ");
        
        //Continue to ask for an input until an acceptable value is input
        while(test==false){ 
            //Check to make sure the input is an integer
            test=myScanner.hasNextInt();
            if(test== false){
                System.out.println("Please input an integer value.");
                myScanner.next();
            }
            else{
                width=myScanner.nextInt();
                //Check to make sure the input is positive
                if(width >= 0 && width <=length){
                    test=true;
                }
                else{
                    System.out.println("Please input a positive number less than the input length.");
                    test=false;
                    
                }
            }
        }
        
        
        
        //Print the top rows of the twist
        for(int i=0; i<(int)(width/2); i++){
            //System.out.println(i);
            for(int j=0; j< length; ){
                //System.out.println(j);
                for(int k=0;k<(2*width) && j<length;k++){
                        
                    if(k==i){
                        System.out.print("#");
                    }
                            
                    else if(k==width-1-i){
                        System.out.print("/");
                    }
                            
                    else if(k==width+i){
                        System.out.print("\\");
                    } 
                            
                    else if(k==(int)width*2-1-i){
                        System.out.print("#");
                    }
                            
                    else{
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            System.out.println("");
        }
            
        //Print middle rows of the twist
        if(width%2!=0){
            for(int j=0; j< length; ){
                //System.out.println(j);
                for(int k=0;k<(int)(2*width) && j<length;k++){
                    if(k==(int)width/2){
                        System.out.print("#");
                    }
                    else if(k==(int)(width*1.5)){
                        System.out.print("\\");
                    }
                    else{
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            System.out.println("");
        }
       
        //Print the bottom rows of the twist
        for(int i=(int)(width/2-1); i>=0; i--){
            //System.out.println(i);
            for(int j=0; j< length; ){
                //System.out.println(j);
                for(int k=0;k<(int)(2*width) && j<length;k++){
                        
                    if(k==0+i){
                        System.out.print("/");
                    }
                            
                    else if(k==(int)width-1-i){
                        System.out.print("#");
                    }
                            
                    else if(k==width+i){
                        System.out.print("#");
                    } 
                            
                    else if(k==(int)width*2-1-i){
                        System.out.print("\\");
                    }
                            
                    else{
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            System.out.println("");
        }
        
    }  
        
}