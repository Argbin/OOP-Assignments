import java.util.Scanner;
import java.util.Vector;
import static java.lang.Math.abs;

public class AssignmentOne{
    public static void main(String[] args){
        scenarioFour(2,3,5,6);
    }

    //A function that prompts the user for integers and then prints out the integers
    public static void scenarioOne(){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        System.out.println("How many integers would you like to input?");
        int numberOfIntegers = sc.nextInt();

        for(int i = 0; i < numberOfIntegers; i++){
            System.out.println("Input number: " + (i+1));

            v.add(sc.nextInt());
        }

        System.out.println("These where the inputed numbers:");
        for(int number : v){
            System.out.println(number);
        }

        sc.close();
    }

    //A function that prompts the user for an integer and then prints the factorial value of that integer.
    public static void scenarioTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int input = abs(sc.nextInt());
        int factorialNum = input == 0 ?  0 : 1;

        for(int i = input; i > 1; i--){
            factorialNum *= i;
        }

        System.out.println("The factorial number would be: " + factorialNum);
        sc.close();
    }

    //A function that asks the user for 2 integers and then checks if their product is divisible by 5.
    public static void scenarioThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 integers!");
        int intOne = sc.nextInt();
        int intTwo = sc.nextInt();
        sc.close();
        if((intOne*intTwo)%5 == 0){
            System.out.println("The product is divisible by 5!  : 1");
        }
        else{
            System.out.println("The product is NOT divisible by 5!  : 0");
        }
    }

    public static void scenarioFour(int n1, int d1, int n2, int d2){
        int newDenominator = d1 * d2;
        int newNumerator = n1*d2 + n2*d1;
        double decimalValue = (double)newNumerator / newDenominator;
        System.out.println(newNumerator + " / " + newDenominator + " = " + decimalValue);
    }
}






