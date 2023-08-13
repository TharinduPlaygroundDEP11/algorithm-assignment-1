import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String phoneNumber = "";
        boolean flag = true;
        loop:
        do {
            System.out.print("Input a phone number : ");
            phoneNumber = scanner.nextLine();
            if(phoneNumber.isBlank()) {
                System.out.println("Phone number can not be empty!");
            }
            
            if (phoneNumber.startsWith("+94")) {
                String substring1 = phoneNumber.substring(3);
                char[] charArray1 = substring1.toCharArray();
                if (charArray1.length == 9) {
                    for (int i = 0; i < charArray1.length; i++) {
                        if(!Character.isDigit(charArray1[i])){
                            System.out.println("Invalid Phone Number!");
                            flag = true;
                            continue loop;
                        } else flag = false;
                    }
                }else {
                    System.out.println("Number not in correct length!");
                    flag = true;
                }
            }

            if (phoneNumber.startsWith("0")) {
                String substring2 = phoneNumber.substring(1);
                char[] charArray2 = substring2.toCharArray();
                if (charArray2.length == 9) {
                    for (int i = 0; i < charArray2.length; i++) {
                        if(!Character.isDigit(charArray2[i])){
                            System.out.println("Invalid Phone Number!");
                            flag = true;
                            continue loop;
                        } else flag = false;
                    }
                }else {
                    System.out.println("Number not in correct length!");
                    flag = true;
                }
            } 
        } while (flag);
        System.out.println("Number is Validated !");
        
    }
}
