// スタンダードな解答
public class FizzBuzz {
    public static void main(String[] args) {
        // for文と条件分岐を使った書き方
        for ( int i = 1; i <= 80; i++ ) {
            if ( i % 3 == 0 && i % 5 == 0 ) System.out.print("FizzBuzz");
            else if ( i % 3 == 0 ) System.out.print("Fizz");
            else if ( i % 5 == 0 ) System.out.print("Buzz");
            else System.out.print(i);
        }
    }
}