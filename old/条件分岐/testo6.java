package 条件分岐;

public class testo6 {
    public static void main(String[] args) {
        //変数に数値を代入
        int n = 2;
        System.out.println("元の変数の値は5です");

        //条件分岐
        if(n > 0){
            System.out.println("nの値は正の数であり、10倍しました");
            n = n * 10;
        }
        else if(n < 0){
            System.out.println("nは負の数であり、-1を掛け正の数に変えます");
    
        }
        else{
            System.out.println("nはゼロであり、変化させません");
        }
        System.out.println("nはゼロであり、変化させません");       
    }
                
}
