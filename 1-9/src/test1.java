public class test1 {
	public static void main(String[] args) {
		
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int n = 5;
		int p = 9;
		
		System.out.println(n + p);
		
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long a = 1111111111;
		
		System.out.println(a * 2);
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。
Boolean bool = Boolean.valueOf(false);
        
        if(bool) {
            System.out.println("true");
        } else {
            System.out.println("false");
		
        }
//		修正後
        String bool1 = "ABC";
        String bool2 = "DEF";
        if (bool1.equals(bool2)) {
        	System.out.println("true");
        } else {
        	System.out.println("false");
        }
	}
}
