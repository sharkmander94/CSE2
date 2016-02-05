//Joe Spano
//2-5-16
//CSE 2
//Cyclometer program to take data produced by a cyclometer and 
//convert it into useful information

public class Cyclometer {
    public static void main(String[] args){
        Double WheelDiameter=27.0;
        Double PI=3.14159;
        int FtPerMi=5280;
        int InPerFt=12;
        int SecPerMinute=60;
        int[] Time= {480,3220}; //In seconds
        int[] Counts={1561,9037};
        //Double Distance[];
        Double[] Distance={0.0,0.0};
        Double TotalDistance;
        
        //Print out just initial inputs
        System.out.println("Trip 1 took "+(Time[0]/SecPerMinute)+" minutes and had "+Counts[0] + " counts.");
        System.out.println("Trip 2 took "+(Time[1]/SecPerMinute)+" minutes and had "+Counts[1] + " counts.");
        
        //Calculate distance traveled on each trip
        //Calculate distance in inches
        Distance[0]= Counts[0]*PI*WheelDiameter;
        Distance[1]= Counts[1]*PI*WheelDiameter;
        
        //calculate distance in miles
        Distance[0]= (Distance[0]/InPerFt)/FtPerMi;
        Distance[1]= (Distance[1]/InPerFt)/FtPerMi;
        
        //Calculate total distance
        TotalDistance=Distance[0]+Distance[1];
        
        //Display information
        System.out.println("Trip 1 was "+Distance[0]+" miles");
        System.out.println("Trip 2 was "+Distance[1]+" miles");
        System.out.println("Total Distance biked was "+TotalDistance+" miles");
        
        
        
    }
}