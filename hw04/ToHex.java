//Take input RGB color values and convert to hexadecimal
import java.util.Scanner;

public class ToHex{
    public static void main(String[] args){
        //declare variables to store values
        int Red=0;
        int Blue=0;
        int Green=0;
        int timesDivided=0;
        int remainder=0;
        String Hexadecimal="";
        Scanner myScanner=new Scanner(System.in);
        
        //take user input checking to insure they are all integers between 0 and 255
        System.out.println("Input RGB color values (R B G).");
        if(myScanner.hasNextInt()== true){
            Red=myScanner.nextInt();
            if(Red<=255 && Red>=0){
                timesDivided=(int) Red/16;
                remainder=Red%16;
                switch(timesDivided){
                    case 10:
                        Hexadecimal=Hexadecimal+"A";
                        break;
                    case 11:
                        Hexadecimal=Hexadecimal+"B";
                        break;
                    case 12:
                        Hexadecimal=Hexadecimal+"C";
                        break;
                    case 13:
                        Hexadecimal=Hexadecimal+"D";
                        break;
                    case 14:
                        Hexadecimal=Hexadecimal+"E";
                        break;
                    case 15:
                        Hexadecimal=Hexadecimal+"F";
                    break;
                    
                    default:
                        Hexadecimal=Hexadecimal+timesDivided;
                        break;
                }
                switch(remainder){
                    case 10:
                        Hexadecimal=Hexadecimal+"A";
                        break;
                    case 11:
                        Hexadecimal=Hexadecimal+"B";
                        break;
                    case 12:
                        Hexadecimal=Hexadecimal+"C";
                        break;
                    case 13:
                        Hexadecimal=Hexadecimal+"D";
                        break;
                    case 14:
                        Hexadecimal=Hexadecimal+"E";
                        break;
                    case 15:
                        Hexadecimal=Hexadecimal+"F";
                        break;
                    case 16:
                        Hexadecimal=Hexadecimal+"G";
                        break;
                    default:
                        Hexadecimal=Hexadecimal+remainder;
                        break;
                }
                    
                if(myScanner.hasNextInt()== true){
                    Green=myScanner.nextInt();
                    if(Green<=255 && Green >=0){
                        timesDivided=(int) Green/16;
                        remainder=Green%16;
                        switch(timesDivided){
                            case 10:
                                Hexadecimal=Hexadecimal+"A";
                                break;
                            case 11:
                                Hexadecimal=Hexadecimal+"B";
                                break;
                            case 12:
                                Hexadecimal=Hexadecimal+"C";
                                break;
                            case 13:
                                Hexadecimal=Hexadecimal+"D";
                                break;
                            case 14:
                                Hexadecimal=Hexadecimal+"E";
                                break;
                            case 15:
                                Hexadecimal=Hexadecimal+"F";
                                break;
                    
                            default:
                                Hexadecimal=Hexadecimal+timesDivided;
                                break;
                        }
                        switch(remainder){
                            case 10:
                                Hexadecimal=Hexadecimal+"A";
                                break;
                            case 11:
                                Hexadecimal=Hexadecimal+"B";
                                break;
                            case 12:
                                Hexadecimal=Hexadecimal+"C";
                                break;
                            case 13:
                                Hexadecimal=Hexadecimal+"D";
                                break;
                            case 14:
                                Hexadecimal=Hexadecimal+"E";
                                break;
                            case 15:
                                Hexadecimal=Hexadecimal+"F";
                                break;
                            case 16:
                                Hexadecimal=Hexadecimal+"G";
                                break;
                            default:
                                Hexadecimal=Hexadecimal+remainder;
                                break;
                        }
                        if(myScanner.hasNextInt()== true){
                            Blue=myScanner.nextInt();
                            if(Blue>=0 && Blue<=255){
                                timesDivided=(int) Blue/16;
                                remainder=Blue%16;
                                switch(timesDivided){
                                    case 10:
                                        Hexadecimal=Hexadecimal+"A";
                                        break;
                                    case 11:
                                        Hexadecimal=Hexadecimal+"B";
                                        break;
                                    case 12:
                                        Hexadecimal=Hexadecimal+"C";
                                        break;
                                    case 13:
                                        Hexadecimal=Hexadecimal+"D";
                                        break;
                                    case 14:
                                        Hexadecimal=Hexadecimal+"E";
                                        break;
                                    case 15:
                                        Hexadecimal=Hexadecimal+"F";
                                        break;
                                    default:
                                        Hexadecimal=Hexadecimal+timesDivided;
                                        break;
                                }
                                switch(remainder){
                                    case 10:
                                        Hexadecimal=Hexadecimal+"A";
                                        break;
                                    case 11:
                                        Hexadecimal=Hexadecimal+"B";
                                        break;
                                    case 12:
                                        Hexadecimal=Hexadecimal+"C";
                                        break;
                                    case 13:
                                        Hexadecimal=Hexadecimal+"D";
                                        break;
                                    case 14:
                                        Hexadecimal=Hexadecimal+"E";
                                        break;
                                    case 15:
                                        Hexadecimal=Hexadecimal+"F";
                                        break;
                                    case 16:
                                        Hexadecimal=Hexadecimal+"G";
                                        break;
                                    default:
                                        Hexadecimal=Hexadecimal+remainder;
                                        break;
                                }
                                System.out.println("Hexadecimal Value: " + Hexadecimal);
                    
                            }
                            else{
                                System.out.println("Please input values between 0 and 255.");
                            }
                        }
                        else{
                            System.out.println("Please input only integers.");
                        }
                    }
                    else{
                        System.out.println("Please input values between 0 and 255.");
                    }
                }    
                else{
                    System.out.println("Please input only integers.");
                }
            }
            else{
                System.out.println("Please input numbers between 0 and 255.");
            }
        }
        else{
            System.out.println("Please input only integers.");
        }
    }
}