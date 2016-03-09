public class TextSpinner{
    public static void main(String[] args){
        //Variable to keep track of which part of the cyle it is in
        int counter=0;
        
        //print the correct character based on cycling counter variable
        while(true){
            switch(counter){
                case 0:
                    System.out.print("\b/");
                    counter++;
                    break;
                case 1:
                    System.out.print("\b-");
                    counter++;
                    break;
                case 2:
                    System.out.print("\b\\");
                    counter++;
                    break;
                case 3:
                    System.out.print("\b|");
                    counter=0;
                    break;
                default:
                    break;
            }
        }
    }
}