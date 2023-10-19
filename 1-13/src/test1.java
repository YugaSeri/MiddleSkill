import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
//		例）
//		for() {
//			for() {
//				for() {
//					
//				}
//			}
//		}
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();
		
		
		String target = "kakao";
		int targetIndex = 0;

		for (int i = 2; i < strArray1.size(); i++) {
		    strArray2.add(strArray1.get(i));
		    for (String s2 : strArray2) {
		        if (s2.equals("k") || s2.equals("a") || s2.equals("o")) {
		            strArray3.add(s2);
		            for (String s3 : strArray3) {
		                if (s3.equals(String.valueOf(target.charAt(targetIndex)))) {
		                    strArray4.add(s3);
		                    targetIndex++;
		                    if (targetIndex < target.length()) {
		                    }
		                    break;  // 次の目的の文字に進む
		                }
		            }
		            if (targetIndex == target.length()) {
		                break;
		            }
		        }
		    }
		    if (targetIndex == target.length()) {
		        break;
		    }
		}
		System.out.print(strArray4);
	}
}
