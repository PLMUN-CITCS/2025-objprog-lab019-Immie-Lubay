import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int getNonNegativeInteger;
        long calculateFactorial = 1;
        
        System.out.println("Enter a non-negative integer:");
        getNonNegativeInteger = input.nextInt();
         
         while (getNonNegativeInteger < 0){
            System.out.println("Error! Try another number");
             getNonNegativeInteger = input.nextInt();
         } if (getNonNegativeInteger == 0) {
            getNonNegativeInteger = 0;
         }else {
             for(int i=1; i<=getNonNegativeInteger; i++)
                calculateFactorial = calculateFactorial * i;
         } 
            System.out.println("The factorial of " + getNonNegativeInteger + " is: " + calculateFactorial);
    }
}