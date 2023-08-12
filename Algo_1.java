import java.util.Scanner;

public class Algo_1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean flag = false;
        int inputNumber;
        int number1 = 0;
        int number2 = 1;
        int number3;
        do {
            System.out.print("Input an positive integer : ");
            inputNumber = scanner.nextInt();
            scanner.nextLine();
            if (inputNumber < 0) {
                flag = true;
                System.out.println("Invalid Input!");
            } else flag = false;
            
        } while (flag);
        
        System.out.print("Fibonacci Series -> " + number1 + ", " + number2);
        do {
            number3 = number1 + number2;
            if (number3 < inputNumber) {
                System.out.print(", " + number3);
                flag = true;
            } else flag = false;
            number1 = number2;
            number2 = number3;

        } while (flag);
        System.out.println();

    }
}
