/*問題
パッケージ名 day01
クラス名 Lesson1.java

"出力します"とコンソールに出力してください。
続けて12、 1.6、 "こんにちは"、 trueをそれぞれ変数に代入しコンソールに出力してください。
変数名は任意とします
また上記から変数を１つを選び、代入する値を1行コメントで記入しなさい。（コメント例 〇〇を代入する）

【出力例】
出力します
12
1.6
こんにちは
true
 * 
 */
package day01;

public class Lesson1 {

	public static void main(String[] args) {
		/*ここから記入*/
		System.out.println("出力します");
		
		int num;
		num = 12;
		//numの値を出力
		System.out.println(12);
		
		double d;
		// s に1.6を代入
		d =1.6;
		//d の値を出力
		System.out.println(1.6);
		
		String str;
		str = "こんにちは";
		//str の値を出力
		System.out.println("こんにちは");
		
		boolean b;
		//b に true　を入力
		b = true;
		//b の値を入力
		System.out.println("true");
		
		int num;
		num = 12;
		double dnum = 1.6;
		//helloに挨拶を代入する
		String hello ="こんにちは";
		boolean b;
		b = true;
		
		System.out.println("出力します");
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(hello + "\n" + b);
		System.out.println(b);
	}
}
