package andとorを用いた表現;

public class Sample02 {
    public static void main(String[] args) {
        // int型の変数nに整数の7を代入
        int n = 7;
        // nの値が0より大きく、なおかつ整数2で割り切れるか？
        if(n > 0 && n%2 == 0) 
        // 上記の条件を満たせば"nは整数の偶数です”を表示する
        System.out.println("nは整数の偶数です");

        // nの値が0より大きいが、2で割り切れなかった時の条件
        else if(n > 0 && n%2 != 0)
        // 上記の条件を満たせば"nは整数の奇数です"を出力する
        System.out.println("nは整数の奇数です");
        
    }
    
}
