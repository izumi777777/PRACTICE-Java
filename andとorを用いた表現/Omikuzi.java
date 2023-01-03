package andとorを用いた表現;

public class Omikuzi {
    public static void main(String[] args) {
        int r = (int)(Math.random()*4);
        if(r == 0) System.out.println("大吉");
        if(r == 1) System.out.println("中吉");
        if(r == 2) System.out.println("小吉");
        if(r == 3) System.out.println("凶");
    }
    
}
