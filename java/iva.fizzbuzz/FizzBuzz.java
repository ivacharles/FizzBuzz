public class FizzBuzz {
    public static void main(String[] args) {
        int numbers =15;
        for (int i = 1; i <= numbers; i++) {
            if(i%3==0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
//        System.out.println("Hello, World!");
    }
}