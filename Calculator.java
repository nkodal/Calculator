import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    float number1;
    float number2;
    int operant;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        DecimalFormat df = new DecimalFormat("###.##");
        while (true) {
            calculator.gatherInput(input);
            calculator.perform(df);
            System.out.println();
            System.out.println();
        }
    }
    private void gatherInput(Scanner input){
        System.out.println("pick 1,2,3,4 based on the operation you want");
        System.out.println("1 for sum");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        operant= (input.nextInt());
        System.out.println("what is the first number");
        number1 = (input.nextFloat());
        System.out.println("what is second number");
        number2= (input.nextFloat());
    }
    private void perform(DecimalFormat df){

        if (operant <1 || operant >4){
            System.out.println("invalid number");
        }else
            switch (operant) {
                case 1:
                    System.out.println(number1 + number2);
                    break;
                case 2:
                    System.out.println(number1 - number2);
                    break;
                case 3:
                    System.out.println(df.format(number1 * number2));
                    break;
                case 4:
                    System.out.println(df.format(number1 / number2));
                    /* System.out.println(number1 / number2); */
                    break;
            }
    }
}
