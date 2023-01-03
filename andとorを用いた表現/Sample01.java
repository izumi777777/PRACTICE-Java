package andとorを用いた表現;

public class Sample01 {
    public static void main(String[] args) {
        final int number = 8; 
        final int hikaku = 2;
        
        if(number > hikaku)
        System.out.println(number + "は" + hikaku + "より大きいです");

        else if(number < hikaku)
        System.out.println(number + "は" + hikaku + "より小さいです");
    }
        
}
