package practice.復習;

import javax.lang.model.util.ElementScanner14;

// else ifを使用して処理を複数に分岐する
public class SampleElseIf1 {
    public static void main(String[] args) {
            
            int n = 0;
            if(n > 0)
                System.out.println("nは正の数です");
            else if(n < 0)
                System.out.println("nは負の数です");
            else
                System.out.println("nは0です");
        
    }
    
}
