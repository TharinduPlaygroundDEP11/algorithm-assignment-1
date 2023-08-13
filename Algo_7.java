import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String inputSentence = "aaabbbccc asdbsj a asdjas asdhb asfhasdbkjdJ SDFBASJK AD";

        // do {
        //     System.out.print("Input a sentence : ");
        //     inputSentence = scanner.nextLine();
        //     if (inputSentence.isBlank()) {
        //         System.out.println("Sentence can not be empty!");
        //     }
            
        // } while (inputSentence.isBlank());
        
      String[] wordsArray = inputSentence.split("[ ,.]");

      int maximumLength = 0;
      int minimumLength = 100;
      String longestWord = "";
      String shortestWord = "";

      for (int i = 0; i < wordsArray.length; i++) {
        if (maximumLength < wordsArray[i].length()) {
            maximumLength = wordsArray[i].length();
            longestWord = wordsArray[i];
        }

        if (minimumLength > wordsArray[i].length()) {
            minimumLength = wordsArray[i].length();
            shortestWord = wordsArray[i];
        }

      }

      System.out.println("Longest Word Length -> " + maximumLength);
      System.out.println("Longest Word Length -> " + longestWord);

      System.out.println("Longest Word Length -> " + minimumLength);
      System.out.println("Longest Word Length -> " + shortestWord);

    }
}
