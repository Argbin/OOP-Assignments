import java.util.Scanner;
import java.util.Vector;

public class AssignmentOne{
    public static void main(String[] args){
        scenarioOne();
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
}
