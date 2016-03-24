//creates triangle patterns based on user input using different looping mechanisms
import java.util.Scanner;

public class Triangles{
    public static void main(String[] args){
        //define variables
        int number=0; //user input
        int k=1,l=0; //iterator variables
        boolean test=false; //used for testing values
        Scanner myScanner= new Scanner(System.in);
        
        System.out.print("Input an integer between 5 and 30: ");
        
        //Continue to ask for an input until an acceptable value is input
        while(test==false){ 
            //Check to make sure the input is an integer
            test=myScanner.hasNextInt();
            if(test== false){
                System.out.println("Please input an integer value.");
                myScanner.next();
            }
            else{
                number=myScanner.nextInt();
                //Check to make sure the input is positive
                if(number >= 5 && number <=30){
                    test=true;
                }
                else{
                    System.out.println("Please input a number between 5 and 3.");
                    test=false;
                    
                }
            }
        }
        
        //Create triangles using for loops
        System.out.println("For loops: ");
        for(int i=1;i<=number;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        for(int i=number-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        
        //Create Triangles with while loops
        System.out.println("");
        System.out.println("While loops: ");
        while(k<=number){
            l=0;
            while(l<k){
                System.out.print(k);
                l++;
            }
            System.out.println("");
            k++;
        }
        
        k=number-1;
        
        while(k>0){
            l=0;
            while(l<k){
                System.out.print(k);
                l++;
            }
            System.out.println("");
            k--;
        }
        
        //Create Triangles with do-while loops
        System.out.println("");
        System.out.println("Do-While loops: ");
        
        k=1;
        do{
            l=0;
            do{
                System.out.print(k);
                l++;
            }while(l<k);
            System.out.println("");
            k++;
        }while(k<=number);
        
        k=number-1;
        
        while(k>0){
            l=0;
            while(l<k){
                System.out.print(k);
                l++;
            }
            System.out.println("");
            k--;
        }
    }
}