import java.util.Random;
import java.util.Scanner;

public class CSE2Linear{
    static Random rand=new Random();
    static Scanner myScanner=new Scanner(System.in);
    public static void Scrambler(int[] array){
        int dummy;
        int pointer;
        for(int i=array.length+3;i>0;i++){
            pointer=rand.nextInt(array.length);
            dummy=array[pointer];
            array[pointer]=array[1];
            array[1]=dummy;
        }
    }
    public static void LinearSearch(int value, int[] array){
        boolean found=false;
        int i=0;
        while(i<array.length){
            if(array[i]==value){
                System.out.println(value+" was found in the list in "+(i+1)+" iterations.");
                found=true;
                break;
            }
            i++;
        }
        if(found==false){
                System.out.println(value+" was not found in in the list in "+(i+1)+" iterations.");
            }
    }
    public static void BinarySearch(int value, int[] array){
        boolean test=false;
        int binaryBottom=0;
        int binaryTop=array.length-1;
        int half;
        int i=1;
        while(test==false){
                     half=(int)binaryBottom+(binaryTop-binaryBottom)/2;
                     if(value==array[half] || value==array[binaryBottom] || value==array[binaryTop]){
                        System.out.println(value+" was found in the array in "+i+" iterations.");
                        break;
                     }
                     if(value>array[half]){
                         binaryBottom=half;
                     }
                     if(value<array[half]){
                         binaryTop=half;
                     }
                     if(binaryTop-binaryBottom==1){
                         System.out.println( value+" was not found on the list in "+i+" iterations.");
                         test=true;
                     }
                     i++;
        }
    }
    
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args){
        int[] input=new int[15];
        boolean test=false;
        System.out.println("Please enter 15 integer grades between 0 and 100 in ascending order");
        for(int i=0;i<15;i++){
            while(test==false){
                if(myScanner.hasNextInt()==false){
                    System.out.println("Input an integer, ya stooge.");
                }
                else{
                    input[i]=myScanner.nextInt();
                    if(input[i]>100 || input[i]<0){
                        System.out.println("Give a number between 0 and 100 ya fool!");
                    }
                    else if(i==0 || input[i]>=input[i-1]){
                        break;
                    }
                    System.out.println("Ascending order stupid.");
                }
            }
        }
        PrintArray(input);
        System.out.println("Input a number to search for");
        BinarySearch(myScanner.nextInt(),input);
        Scrambler(input);
        PrintArray(input);
        System.out.println("Input another number to search for");
        LinearSearch(myScanner.nextInt(),input);
    }
}