import java.util.Random;
import java.util.Scanner;

public class Holoporter{
    static Scanner myScanner = new Scanner(System.in);
    static Random Rand= new Random();
    public static String[] usedCodes=new String[1000];
    
    public static boolean codeChecker(String code){
        boolean test=false;
        int i=0;
        while(test==false){
            if(usedCodes[i]==code){
                return false;
            }
            else if(usedCodes[i]=="?"){
                usedCodes[i]=code;
                return true;
            }
            i++;
        }
        return false;
    }
    
    
    public static String[][][] soRandom(){
        String[][][] array= new String[Rand.nextInt(10)+1][][];
        for(int i=0; i<array.length; i++){
            array[i]=new String[Rand.nextInt(10)+1][];
            for(int j=0; j<array[i].length; j++){
                array[i][j]=new String[Rand.nextInt(10)+1];
            }
        }
        return array;
    }
    
    public static String coder(){
        char[] code= new char[6];
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        while(true){
            code[0]=alphabet.charAt(Rand.nextInt(26));
            code[1]=alphabet.charAt(Rand.nextInt(26));
            code[2]=(char) (Rand.nextInt(10)+'0');
            code[3]=(char) (Rand.nextInt(10)+'0');
            code[4]=(char) (Rand.nextInt(10)+'0');
            code[5]=(char) (Rand.nextInt(10)+'0');
            
            if(codeChecker(String.valueOf(code))==true){
                return String.valueOf(code);
            }
        }
    }
    
    public static void Print(String[][][] input){
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++){
                System.out.print("[");
                for(int k=0; k<input[i][j].length;k++){
                    if(k!=input[i][j].length-1){
                        System.out.print(input[i][j][k]+" , ");
                    }
                    else{
                        System.out.print(input[i][j][k]+"]");
                    }
                }
                if(j!=input[i].length-1){
                    System.out.print(" | ");
                }
                else{
                    if(i!=input.length-1){
                        System.out.print("---");
                    }
                }
            }
        }
    }
    
    public static void holoport(String[][][] Location1, String[][][] Location2){
        for(int i=0; i<Location2.length; i++){
            for(int j=0; j< Location2[i].length; j++){
                for(int k=0; k<Location2[i][j].length;k++){
                    if( Location1.length-1>=i && Location1[i].length-1>=j && Location1[i][j].length-1>=k){
                        Location2[i][j][k]=Location1[i][j][k];
                    }
                    else{
                        Location2[i][j][k]="$$$$$$";
                    }
                    
                }
            }
        }
    }
    public static void sampling(String[][][] array, String input){
        boolean test=false;
        char[] inputChar=input.toCharArray();
        while(test==false){
            if(Character.isLetter(inputChar[0])== true && Character.isLetter(inputChar[1])== true && Character.isDigit(inputChar[2])== true &&
               Character.isDigit(inputChar[3])== true && Character.isDigit(inputChar[4])== true && Character.isDigit(inputChar[5])== true){
                   test=true;
               }
            else{   
                System.out.println("Please input a valid code");
                input=myScanner.next();
                inputChar=input.toCharArray();
            }
        }
        test=false;
        for(int i=0; i<array.length; i++){
            for(int j=0; j< array[i].length; j++){
                for(int k=0; k<array[i][j].length;k++){
                    if(array[i][j][k].equalsIgnoreCase(input)){
                        System.out.println("Code was found at ("+i+","+j+","+k+").");
                        test=true;
                        break;
                    }
                }
            }
        }
        if(test==false){
        System.out.println("The code was not found");
        }
    }
    public static int percentage(String[][][] Loc1, String[][][] Loc2){
        int counter1=0;int counter2=0;int percent;
        
        for(int i=0; i<Loc1.length; i++){
            for(int j=0; j< Loc1[i].length; j++){
                for(int k=0; k<Loc1[i][j].length;k++){
                    counter1++;
                }
            }
        }
        for(int i=0; i<Loc2.length; i++){
            for(int j=0; j< Loc2[i].length; j++){
                for(int k=0; k<Loc2[i][j].length;k++){
                    counter2++;
                }
            }
        }
        percent=((counter2-counter1)*100)/counter1;
        return percent;
        
    }
    public static void frankenstein(String[][][] input){
        String temp="";
        String[] tempArray;
        int digit=0;
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++){
                for(int k=0; k<input[i][j].length;k++){
                    for(int r=k; r<input[i][j].length;r++){
                        digit=0;
                        while(digit<6){
                            if(Character.toLowerCase(input[i][j][k].charAt(digit))>=Character.toLowerCase(input[i][j][r].charAt(digit))){
                                if(Character.toLowerCase(input[i][j][k].charAt(digit))==Character.toLowerCase(input[i][j][r].charAt(digit))){
                                    digit++;
                                }
                                else{
                                    temp=input[i][j][k];
                                    input[i][j][k]=input[i][j][r];
                                    input[i][j][r]=temp;
                                    break;
                                }
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
            }
        }
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++){
                for(int k=j; k<input[i].length;k++){
                    if(input[i][j].length > input[i][k].length){
                        
                        tempArray=input[i][j];
                        input[i][j]=input[i][k];
                        input[i][k]=tempArray;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        String[][][] Molecules=soRandom();
        String[][][] Location2=soRandom();
        
        for(int i=0; i<usedCodes.length;i++){
            usedCodes[i]="?";
        }
        for(int i=0; i<Molecules.length; i++){
            for(int j=0; j< Molecules[i].length; j++){
                for(int k=0; k<Molecules[i][j].length;k++){
                    Molecules[i][j][k]=coder();
                }
            }
        }
        Print(Molecules);
        holoport(Molecules,Location2);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Print(Location2);
        System.out.println("");
        System.out.println("Input a code to search for in the new location");
        sampling(Location2,myScanner.next());
        System.out.println("The holoporting percent is "+percentage(Molecules,Location2)+"%");
        frankenstein(Location2);
        Print(Location2);
    }
}