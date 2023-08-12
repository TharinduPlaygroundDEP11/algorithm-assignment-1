public class Algo_2 {
    public static void main(String[] args) {
        int[] numbers = {-5, 2, 7, 10, 58, -7, 8, 23};

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]){
                maximum = numbers[i];
            }

            if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }
        System.out.println("Maximum Value : " + maximum);
        System.out.println("Minimum Value : " + minimum);
    }

}
