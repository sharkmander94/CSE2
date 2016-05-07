import java.util.Random;
import java.util.Scanner;

public class RaggedArray{
     public static void PrintArray(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                
            System.out.print("["+array[i][j] +"] ");
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        Random rand = new Random();
        int temp=0;
        int[] temp2;
        
        System.out.println("Input the \"height\" of the array");
        int[][] array = new int[myScanner.nextInt()][];
        for(int i=0; i<array.length;i++){
            array[i]=new int[rand.nextInt(array.length-1)+1];
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=rand.nextInt(21);
            }
        }
        PrintArray(array);
        
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                for(int k=j; k<array[i].length;k++){
                    if(array[i][j]>array[i][k]){
                        temp=array[i][j];
                        array[i][j]=array[i][k];
                        array[i][k]=temp;
                        
                    }
                }
            }
        }
        System.out.println("");
        PrintArray(array);
        
        for(int i=0; i<array.length;i++){
            for(int j=i; j<array.length;j++){
                if(array[i].length>array[j].length){
                    temp2=array[i];
                    array[i]=array[j];
                    array[j]=temp2;
                }
            }
        }
        System.out.println("");
        PrintArray(array);
        boolean test=false;
        System.out.println("Input a number to search for");
        temp=myScanner.nextInt();
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                if(array[i][j]==temp){
                   System.out.println(temp+" was found at row "+(i+1) +" and column "+(j+1));
                   j=array[i].length-1;
                  
                   test=true;
                }
                 i=array.length-1;
                
            }
        }
        if(test==false){
            System.out.println(temp+" was not found.");
        }
    }
}