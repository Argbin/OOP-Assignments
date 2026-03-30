import java.util.Scanner;
import java.util.Vector;
import static java.lang.Math.abs;

public class AssignmentOne{
    public static void main(String[] args){
        scenarioTwo();
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
        int factorialNum = 1;

        for(int i = input; i > 1; i--){
            factorialNum *= i;
        }

        System.out.println("The factorial number would be: " + factorialNum);
        sc.close();
    }
}
