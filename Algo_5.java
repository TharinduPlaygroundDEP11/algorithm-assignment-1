import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String inputText;

        do {

            System.out.print("Enter a text you want to reverse : ");
            inputText = scanner.nextLine();
            if (inputText.isBlank()) System.out.println("Text can not be empty!");

        } while (inputText.isBlank());

        char[] inputCharArray = inputText.toCharArray();
        int x = 0;
        int y = inputCharArray.length - 1;
        char tempChar;

        while (x < y) {
            tempChar = inputCharArray[x];
            inputCharArray[x] = inputCharArray[y];
            inputCharArray [y] = tempChar;
            x++;
            y--;
        }

        System.out.print("Reversed text -> ");
        for (int i = 0; i < inputCharArray.length; i++) {
            System.out.print(inputCharArray[i]);
        }
        System.out.println();
        
    }
}
