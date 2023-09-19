package practice.doubleloop;

public class Multiplication {
    public static void main(String[] args) {
        for(int y=1; y<=18; y++) {
            System.out.print(y+"の段"); ///何の段かを出力します
            for(int x=1; x<=18; x++) {
                int k = x*y;// これが九九の値です
                System.out.print(k+" ");
            }
            System.out.println(" "); //段ごとに改行します
        }
    }
    
}
