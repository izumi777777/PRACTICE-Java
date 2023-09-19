package practice.fortest;

// 変数の適用範囲
public class Sample04 {
    public static void main(String[] args) {
        int a = 0;
        for(int i=0; i<10; i++){
            a = a + 10;
            System.out.println(a);
        }
        a = a * 10;
        System.out.println(a);
    }
}
