package 変数の初期化;


public class Sample01 {
    public static void main(String[] args) {
        // number変数に数値を代入します
        int number = 20;
        String messege = "俺の年齢は";
        
        //変数numberを表示してください
        System.out.println(messege + number + "歳だ。　");

        number = 32;
        System.out.println(".....本当は" + number + "歳だ。　");
    }
}