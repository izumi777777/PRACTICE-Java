package 変数の上書き;

public class Sample01 {
    public static void main(String[] args) {
        // データ型doubleを宣言した変数piに数値を代入
        double pi = 3.14; //  円周率を入れた変数
        int pie = 5; 

        System.out.print("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * pi + "cmです。");
        System.out.println("パイの半径を倍にします");
        pi = 10;
        System.out.println("半径" + pie * pi);
        System.out.println(pie * pie * pi);

    }

}