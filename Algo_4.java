public class Algo_4 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50, 60};

        int x = 0;
        int y = nums.length - 1;
        int temp;

        while (x < y) {
            temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;
            x++;
            y--;
        }

        System.out.print("Opposite Sequence : [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
