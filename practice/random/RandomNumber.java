package practice.random;

//**  乱数　*/

public class RandomNumber {
    public static void main(String[] args) {
        // 変数の宣言
        double r = Math.random();
        int i = (int)(r*10);
        
        // 変数rに格納されたランダムな整数を表示する
        System.out.println(i);
    }
    
    
}
