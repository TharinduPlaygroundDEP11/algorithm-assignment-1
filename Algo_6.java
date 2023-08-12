import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String inputSentence;

        do {

            System.out.print("Enter a sentence : ");
            inputSentence = scanner.nextLine();
            if (inputSentence.isBlank()) System.out.println("Text can not be empty!");

        } while (inputSentence.isBlank());

        String[] wordsArray = inputSentence.split("[ ,.]");
        
        int x = 0;
        int y = wordsArray.length - 1;
        String tempString;

        while (x < y) {
            tempString = wordsArray[x];
            wordsArray[x] = wordsArray[y];
            wordsArray[y] = tempString;
            x++;
            y--;
        }

        System.out.println("Your sentence -> \n" + inputSentence);

        System.out.println("\nWords Reversed from your sentence -> ");
        for (int i = 0; i < wordsArray.length; i++) {
            if (!wordsArray[i].equals("")) System.out.print(wordsArray[i] + ", ");
        }
        System.out.println("\b\b ");
        
    }
}
