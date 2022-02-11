import java.util.Arrays;

public class FizzBuzzTest {
    public static void main(String[] args) {
        String[] fizzBuzzResult = {"1","2","Fizz"};
        String[] fizzBuzzTest = FizzBuzz.run(3);

        for(int i=0; i<fizzBuzzResult.length; i++){
            if(fizzBuzzResult[i].equals(fizzBuzzTest[i])){
                System.out.println("pass");
            }else {
                System.out.println("fail");
            }
        }
    }
}