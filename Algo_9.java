import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String inputWord = "";
        do {
            System.out.print("Input a single word : ");
            inputWord = scanner.nextLine();
            if (inputWord.isBlank()) {
                System.out.println("Word can not be empty!");
            }
            if (inputWord.split(" ").length > 1) {
                System.out.println("Invalid input, please enter a single word!");
            }
        } while (inputWord.isBlank() || (inputWord.split(" ").length > 1));

        char[] inputCharArray = inputWord.toCharArray();
        char[] tempArray = new char[inputCharArray.length];

        for (int i = 0, j = tempArray.length - 1; i < tempArray.length; i++, j--) {
            tempArray[j] = inputCharArray[i];
        }

        int count = 0;
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] == tempArray[i]) count++;
        }
        if (count == inputCharArray.length) {
            System.out.println(inputWord + " <- is a Palindrome");
        } else System.out.println(inputWord + " <- is not a palindrome");
        
    }
}
