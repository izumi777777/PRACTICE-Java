package practice.importtest;

import java.io.*;

public class ImportSample {
    public static void main(String[] args) throws IOException {
        System.out.println("文字列を入力し[Enter/return]を押してください");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();
            System.out.println("あなたが入力した文字列は " +str);
        
        }

    
}
