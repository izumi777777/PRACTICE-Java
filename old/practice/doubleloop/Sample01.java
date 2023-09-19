package practice.doubleloop;

public class Sample01 {
    public static void main(String[] args) {
        for(int y=0; y<3; y++) {
            System.out.println("y="+y);
            for(int x=0; x<5; x++) {
                System.out.print("x=" +x+",");
            }
            System.out.println("");
        }
    }    
}
