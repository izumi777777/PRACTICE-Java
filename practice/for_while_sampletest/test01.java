package practice.for_while_sampletest;

/*　　---- 問題1 ----
 iの初期値や条件式の値を書き換えて、出力される結果を確認しましょう。
このとき、例えば「for(int i=10; i<5; i++)というように、初期値を条件式の値より大きくすると
処理は一度も実行されません。それも試してみましょう。
*/

public class test01 {
    public static void main(String[] args) {
        int i = 0;
        for(i=1; i<=10; i++) System.out.println(i);
    }
    
}
