package 条件分岐;

import javax.lang.model.util.ElementScanner14;

public class test04 {
    public static void main(String[] args) {
        final int n = 1;
        
        if(n > 0)
            System.out.println("nは正の数です");
        else if(n < 0)
            System.out.println("nは負の数です");
        else
            System.out.println("nはゼロです");
    }
}
