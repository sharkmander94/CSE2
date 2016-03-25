import java.util.Random;
import java.util.Scanner;

public class Sentence{
    public static String Subject(int i){
        switch (i){
            case 0:
                return "dog";
            case 1:
                return "cat";
            case 2:
                return "murder";
            case 3:
                return "fire fighter";
            case 4:
                return "smart phone";
            case 5:
                return "alligator";
            case 6:
                return "flying car";
            case 7:
                return "professor";
            case 8:
                return "abstract concept of thought";
            case 9:
                return "superhero";
            default:
                return "error";
        }
    }
    public static String Adjective(int i){
        switch (i){
            case 0:
                return "ugly";
            case 1:
                return "fat";
            case 2:
                return "european";
            case 3:
                return "dull";
            case 4:
                return "fantastic";
            case 5:
                return "needlessly complicated";
            case 6:
                return "independent";
            case 7:
                return "angry";
            case 8:
                return "banana shaped";
            case 9:
                return "dead";
            default:
                return "error filled";
        }
    }
    public static String Verb(int i){
        switch (i){
            case 0:
                return "killed";
            case 1:
                return "shot";
            case 2:
                return "met";
            case 3:
                return "ran over";
            case 4:
                return "ate";
            case 5:
                return "invited";
            case 6:
                return "catapulted";
            case 7:
                return "taught";
            case 8:
                return "shattered";
            case 9:
                return "married";
            default:
                return "errored";
        }
    }
    public static String Object(int i){
        switch (i){
            case 0:
                return "family";
            case 1:
                return "classroom";
            case 2:
                return "wood";
            case 3:
                return "church";
            case 4:
                return "meal";
            case 5:
                return "janitor";
            case 6:
                return "crab";
            case 7:
                return "sand blaster";
            case 8:
                return "geologist";
            case 9:
                return "pyroclastic flow";
            default:
                return "error 2";
        }
    }
    public static void main(String[] args){
        String response = "yes";
        Scanner myScanner = new Scanner(System.in);
        Random myRand = new Random();
        
        while(response.equalsIgnoreCase("yes")){
            System.out.println("The "+Adjective(myRand.nextInt(10))+ " " +Subject(myRand.nextInt(10))+ " " + Verb(myRand.nextInt(10)) + " the " +
                                Adjective(myRand.nextInt(10))+ " " + Object(myRand.nextInt(10)) + ".");
            System.out.println("Create another sentence (yes/no)?");
            response=myScanner.next();
        
    
        }
    }
}