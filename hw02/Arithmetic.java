//import class to deal with truncating values
import java.text.DecimalFormat;

public class Arithmetic{
    public static void main(String[] args){
        //Define object to deal with truncating values (mny stands for money)
        DecimalFormat mny =new DecimalFormat("#.00");
        
        //Define variables
        //purchases[x][0]=Quantity
        //purchases[x][1]=Price
        //purchases[x][2]=Subtotal w/o tax
        //purchases[x][3]=Subtotal w/ tax
        //purchases[x][4]=Sales tax
        double[][] purchases;
        purchases= new double[3][5]; 
        double salesTax=1.06;
        //totals[0]=Total cost w/0 tax
        //totals[1]=Total sales tax
        //totals[2]=Total cost w/ tax
        double[] totals={0,0,0};
        String[] products;
        products=new String[3];
    
        //Define prices and quantities
    
        //Sharks
        products[0]="Sharks";
        purchases[0][0]=2.00;
        purchases[0][1]=99.99;
    
        //Manta Rays
        products[1]="Manta Rays";
        purchases[1][0]=3.00;
        purchases[1][1]=54.99;
    
        //Seahorses
        products[2]="Seahorses";
        purchases[2][0]=5.00;
        purchases[2][1]=34.99;
    
        //calculate totals and tax
        for(int i=0; i<3; i++){
            //calculate cost before tax
            purchases[i][2]=purchases[i][0]*purchases[i][1];
            
            //calculate price with tax
            purchases[i][3]=salesTax*purchases[i][0]*purchases[i][1];
            
            //calculate tax
            purchases[i][4]=purchases[i][2]*(salesTax-1);
            
            //add the results to the running total
            totals[0]=totals[0]+purchases[i][2];
            totals[1]=totals[1]+purchases[i][4];
            totals[2]=totals[2]+purchases[i][3];
            
            //print results for each product
            System.out.println("Total cost of "+ products[i]+ " is $"+ mny.format(purchases[i][3])+".");
            System.out.println("Sales tax for "+ products[i]+ " is $"+ mny.format(purchases[i][4]) +".");
            System.out.println("");
        }
        
        //print totals
        System.out.println("Subtotal= $"+ mny.format(totals[0] ));
        System.out.println("Sales tax= $"+ mny.format(totals[1]));
        System.out.println("Grand total= $" +mny.format(totals[2]));
    }
}

    