import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int numbers = 3;
        System.out.println(Arrays.asList(run(numbers)));
    }
    public static String [] run(int number){
        String [] result = new String[number];
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result[i-1] = "FizzBuzz";
            } else if (i % 5 == 0) {
                result[i-1] = "Buzz";
            } else if (i % 3 == 0) {
                result[i-1] = "Fizz";
            } else {
                result[i-1] = i+"";
            }
        }
        return result;
    }
}