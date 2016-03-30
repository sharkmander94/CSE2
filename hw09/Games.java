//A sort of arcade that allows a user to choose multiple games
//I had to use character arrays to complete the scramber, i'm not sure if we have learned this yet, but I'm hoping I don't lose points for it
//I didn't know how else to do it. 

import java.util.Random;
import java.util.Scanner;

public class Games{
    static Scanner myScanner=new Scanner(System.in);
    static Random myRand=new Random();
    public static boolean test=false;
    
    public static void guessTheBox(){
        int guess=1;
        test=false;
        System.out.println("Choose a box, one contains a prize");
        System.out.println("        [1]     [2]     [3]");
        while(test==false){
            if (myScanner.hasNextInt()==true){
                guess=myScanner.nextInt();
                if(guess==1 || guess==2 || guess==3){
                    if(guess==myRand.nextInt(2)+1){
                        System.out.println("Congratulations you won a lifetime supply of cat food!");
                    }
                    else{
                        System.out.println("You lost and you're a loser and you should feel bad.");
                    }
                }
                else{
                    System.out.println("That is not a valid box number");
                }
            }
            else{
                System.out.println("Please input a correct box number");
            }
            test=true;
        }
    }
    public static void spinTheWheel(){
        String color="Red";
        String randColor="Red";
        int number=1;
        int randNumber=1;
        test=false;
        
        System.out.println("Choose a color (Red or Black)");
        while(test==false){
            color=myScanner.nextLine();
            if(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("black")){
                test=true;
            }
            else{
                System.out.println("Please input a valid color");
            }
        }
        test=false;
        System.out.println("Choose a number between 1 and 5.");
        while(test==false){
            if (myScanner.hasNextInt()==true){
                number=myScanner.nextInt();
                if(number>=1 && number<=5){
                   test=true;
                }
                else{
                    System.out.println("That is not a valid number");
                }
            }
            else{
                System.out.println("Please input a number between 1 and 5");
            }
        }
        randNumber=myRand.nextInt(4)+1;
        switch(myRand.nextInt(1)){
            case 0:
                randColor="Red";
                break;
            case 1:
                randColor="Black";
                break;
            default:
                break;
        }
        System.out.println("The wheel landed on "+randColor+" "+randNumber);
        if(color.equalsIgnoreCase(randColor)&&number==randNumber){
            System.out.println("You won!");
        }
        else{
            System.out.println("You lost, ya loser");
        }
    }
    
    public static String scrambler(){
        String input="";
        char placeholder='g';
        int location=0;
        
        System.out.println("Input a word to be scrambled");
        input=myScanner.next();
        char[] inputArray=input.toCharArray();
        for(int i=input.length();i>=0;i--){
            location=myRand.nextInt(input.length());
            placeholder=input.charAt(location);
            inputArray[location]=input.charAt(0);
            inputArray[0]=placeholder;
            input=String.valueOf(inputArray);
        }
        return input;
    }
    public static void main(String[] args){
        String chosenGame="";
        
        
        System.out.println("Welcome to the Spano Game Corner");
        System.out.println("What would you like to play?");
        System.out.println("-Guess the Box -Spin the Wheel -Scrambler");
        
        chosenGame=myScanner.nextLine();
        switch(chosenGame){
            case "Guess the Box":
                guessTheBox();
                break;
            case  "Spin the Wheel":
                spinTheWheel();
                break;
            case "Scrambler":
                System.out.println(scrambler());
                break;
            default:
                System.out.println("Sorry we don't have that game (check your capitalization).");
                break;
        }
        
        
    }
}