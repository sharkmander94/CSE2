//Check splitting program that takes user inputs and evenly splits the check
import java.util.Scanner;
import java.text.DecimalFormat;

public class Check{
    public static void main(String[] args){
        Double total;
        Double tip;
        Double numOfPeople;
        Double pricePerPerson;
        //create scanner object
        Scanner myScanner = new Scanner(System.in);
        //create object to convert results to number format
        DecimalFormat mny =new DecimalFormat("$#.00");
        
        //Recieve input from user
        System.out.print("Input original cost of the check (in the form XX.XX): ");
        total=myScanner.nextDouble();
        System.out.print("Input percentage tip you would like to give (in the form XX): ");
        tip=myScanner.nextDouble();
        System.out.print("Input number of people splitting the check: ");
        numOfPeople=myScanner.nextDouble();
        
        //Calculate the cost per person
        pricePerPerson=(total*(1+(tip/100)))/numOfPeople;
        
        //Output result
        System.out.println("Everyone should each pay "+mny.format(pricePerPerson));
    }
}