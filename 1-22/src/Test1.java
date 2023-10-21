import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		//改行
		Date now = new Date();
		System.out.println(now);
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		//改行
		SimpleDateFormat sdFormat1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdFormat2 = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date date1 = sdFormat1.parse(shinyaBirthday);
			Date date2 = sdFormat2.parse(minamiBirthday);
			if (date1.before(date2)) {
				System.out.println(shinyaBirthday);
			}
			if (date2.before(date1)) {
				System.out.println(minamiBirthday);
			}
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		SimpleDateFormat sdFormat3 = new SimpleDateFormat("yyyy/MM/dd");
		Date date3 = new Date();
		try {
			date3 = sdFormat3.parse(furuyamaBirthday);
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		 Calendar calendar = Calendar.getInstance();
	        calendar.setTime(date3);
	        
	        // 日時を加算する
	        calendar.add(Calendar.YEAR, 5);
	        calendar.add(Calendar.MONTH, 2);
	        
	        // Calendar型の日時をDate型に戻す
	        Date d1 = calendar.getTime();
	        System.out.println(sdFormat3.format(d1));
	    }

	
}
