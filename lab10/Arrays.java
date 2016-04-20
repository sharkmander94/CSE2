import java.util.Random;
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        Random rand=new Random();
        Scanner myScanner=new Scanner(System.in);
        String[] students=new String[rand.nextInt(5)+6];
        int[] midterm=new int[students.length];
        System.out.println("input "+students.length+" student names.");
        for(int i=0;i<students.length;i++){
            students[i]=myScanner.nextLine();
            midterm[i]=rand.nextInt(101);
        }
        System.out.println("Here are the grades for your students:");
        System.out.println();
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]+": "+midterm[i]);
        }
    }
}