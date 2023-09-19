package todaysdate;
import java.time.LocalDate;
 
public class TodayDataGetSample {
    // メソッド開始
    public static void main(String[] args) {
        
        //LocalDate型のtodaysdate変数に本日の日付を代入する
        LocalDate todaysdate = LocalDate.now();
        //todaydateに代入された本日の日付をyyyy-MM-dd形式で表示する
        System.out.println("todaydata:" + todaysdate);
        
    }
}
        
    

