import java.util.Scanner;

public class Hexidecimal{
    public static String convertToHex(int input){
        switch(input){
                    case 10:
                        return "A";

                    case 11:
                       return "B";

                    case 12:
                        return "C";

                    case 13:
                        return "D";

                    case 14:
                        return "E";

                    case 15:
                        return "F";
                    
                    default:
                        return Integer.toString(input);
                }
    }
    
    public static void main(String[] args){
        //declare variables to store values
        int[] inputs = new int[3];
        String Out="";
        int counter=0;
        Scanner myScanner=new Scanner(System.in);
        
        //take user input checking to insure they are all integers between 0 and 255
        System.out.println("Input RGB color values (R B G).");
        for(int i=0;i<3;i++){
            if(myScanner.hasNextInt() == true){
                inputs[i]=myScanner.nextInt();
                if(inputs[i]<=255 && inputs[i]>=0){
                    Out= Out + convertToHex((int)inputs[i]/16)+convertToHex(inputs[i]%16);
                    counter=counter + 1;
                }
                else{
                    System.out.println("Please input values between 0 and 255");
                    break;
                }
            }
            else{
                System.out.println("Please input all integers.");
                break;
            }
        }
        if(counter==3){
            System.out.println("Hexadecimal value: " + Out);
        }
    }
}