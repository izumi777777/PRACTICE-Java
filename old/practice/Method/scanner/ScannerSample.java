package practice.Method.scanner;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        System.out.println("Scannerで文字列の入力を行います");
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.next();
            System.out.println("入力した文字列は " + str);
        }

    }

}
