import java.util.Random;
import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args){
        int[] array1=new int[50];
        int[] array2=new int[50];
        int max=0,min=100;
        int search=0, binaryTop=49,binaryBottom=0,half=24;
        boolean test=false;
        Random rand=new Random();
        Scanner myScanner=new Scanner(System.in);
        
        array2[0]=rand.nextInt(101);
        for(int i=0;i<array1.length-1;i++){
            array1[i]=rand.nextInt(101);
            array2[i+1]=rand.nextInt(101)+array2[i];
        }
        array1[49]=rand.nextInt(101);
        array2[49]=rand.nextInt(101)+array2[48];
        
        for(int i=0;i<array1.length;i++){
            if(array1[i]>max){
                max=array1[i];
            }
            if(array1[i]<min){
                min=array1[i];
            }
        }
        System.out.println("Array1 max: "+max);
        System.out.println("Array1 min: "+min);
        
        max=0;min=100;
        for(int i=0;i<array2.length;i++){
            if(array2[i]>max){
                max=array2[i];
            }
            if(array2[i]<min){
                min=array2[i];
            }
        }
        System.out.println("Array2 max: "+max);
        System.out.println("Array2 min: "+min);
        
        System.out.println("Input an integer greater or equal to 0");
        if(myScanner.hasNextInt()){
             search=myScanner.nextInt();
             if(search>=0){
                 while(test==false){
                     half=(int)binaryBottom+(binaryTop-binaryBottom)/2;
                     if(search==array2[half] || search==array2[binaryBottom] || search==array2[binaryTop]){
                        System.out.println("That number is in the array");
                        break;
                     }
                     if(search>array2[half]){
                         binaryBottom=half;
                     }
                     if(search<array2[half]){
                         binaryTop=half;
                     }
                     if(binaryTop-binaryBottom==1){
                         System.out.println("Your number is not in the list");
                         System.out.println("Number above search: "+array2[binaryTop]);
                         System.out.println("Number below search: "+array2[binaryBottom]);
                         test=true;
                     }
                 }
             }
             else{
                 System.out.println("I just said to input an int<=0, jeez");
             }
        }
        else{
            System.out.println("that's not an int, jeez");
        }
        
       
        
        
    }
}