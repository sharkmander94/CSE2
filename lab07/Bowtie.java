//program prints out a "Bowtie" whose size is input by the user
import java.util.Scanner;

public class Bowtie{
    public static void main(String[] args){
        int nStars=9;
        int dummy=0;
        int input=0;
        boolean test=false;
        String stop=" ";
        Scanner myScanner=new Scanner(System.in);
        
//         dummy=nStars;
        
//         for(int i= (int)(nStars/2); i>0;i--){
//             for(int k=((nStars-dummy)/2);k>0;k--){
//                 System.out.print(" ");
//             }
//             for(int j=dummy;j>0;j--){
//               System.out.print("*"); 
//             }
//             System.out.println("");
//             dummy=dummy-2;
//         }
//         for(int i=(nStars-1)/2;i>0;i--){
//             System.out.print(" ");
//         }
//         System.out.println("*");
        
//         dummy=3;
        
//         for(int i= (int)(nStars/2); i>0;i--){
//             for(int k=((nStars-dummy)/2);k>0;k--){
//                 System.out.print(" ");
//             }
//             for(int j=dummy;j>0;j--){
//               System.out.print("*"); 
//             }
//             System.out.println("");
//             dummy=dummy+2;
//         }
// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
//         System.out.println(" ");
//         nStars=5;
//         dummy=nStars;
//         for(int i= (int)(nStars/2); i>0;i--){
//             for(int k=((nStars-dummy)/2);k>0;k--){
//                 System.out.print(" ");
//             }
//             for(int j=dummy;j>0;j--){
//               System.out.print("*"); 
//             }
//             System.out.println("");
//             dummy=dummy-2;
//         }
//         for(int i=(nStars-1)/2;i>0;i--){
//             System.out.print(" ");
//         }
//         System.out.println("*");
        
//         dummy=3;
        
//         for(int i= (int)(nStars/2); i>0;i--){
//             for(int k=((nStars-dummy)/2);k>0;k--){
//                 System.out.print(" ");
//             }
//             for(int j=dummy;j>0;j--){
//               System.out.print("*"); 
//             }
//             System.out.println("");
//             dummy=dummy+2;
//         }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        while(true){
            test=false;
            System.out.println("Input an odd integer value between 3 and 33: ");
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
                    if(input >= 3 && input<= 33 && (input%2)!=0){
                        test=true;
                    }
                    else{
                        System.out.println("Please input an odd integer between 3 and 33.");
                        test=false;
                        
                    }
                }
            }
            
            nStars=input;
            dummy=nStars;
            for(int i= (int)(nStars/2); i>0;i--){
                for(int k=((nStars-dummy)/2);k>0;k--){
                    System.out.print(" ");
                }
                for(int j=dummy;j>0;j--){
                   System.out.print("*"); 
                }
                System.out.println("");
                dummy=dummy-2;
            }
            for(int i=(nStars-1)/2;i>0;i--){
                System.out.print(" ");
            }
            System.out.println("*");
            
            dummy=3;
            
            for(int i= (int)(nStars/2); i>0;i--){
                for(int k=((nStars-dummy)/2);k>0;k--){
                    System.out.print(" ");
                }
                for(int j=dummy;j>0;j--){
                   System.out.print("*"); 
                }
                System.out.println("");
                dummy=dummy+2;
            }
            System.out.println("Do it again?");
            stop=myScanner.next();
            if(stop.equalsIgnoreCase("y")==false){
                break;
            }
        }
    }
}