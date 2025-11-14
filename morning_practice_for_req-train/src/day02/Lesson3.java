//追加問題

//パッケージ名 day02
//クラス名 Lesson3.java

//3つの任意の整数をコンソールから入力し、税込み金額（消費税は8％計算）の合計を出しなさい。
//また、平均金額を求めなさい。
//キャストしてすべて整数値で求めること。
//【出力例】
//金額①を入力してください>>210
//金額②を入力してください>>300
//金額③を入力してください>>350
//①から③の合計は税込み928円
//①から③の平均は税込み309円

package day02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {

	public static void main(String[] args) throws IOException {

		//↓初期化
		int sum = 0;// 合計金額
		int average = 0;// 平均金額
		int inputCount = 0;//入力した回数
		double dSum = 0;//自分で作る
		/*ここから記入*///

		System.out.println("金額①を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sPrice1 = reader.readLine();
		double dPrice1= Double.parseDouble(sPrice1);
		dPrice1 *=
		
		inputCount++;
		
		
		System.out.println("金額②を入力してください");
		String sPrice2 = reader.readLine();
		double dPrice2= Double.parseDouble(sPrice1);
		dPrice2 *=
		
		inputCount++;
		
		
		System.out.println("金額③を入力してください");
		String sPrice3 = reader.readLine();
		double dPrice3= Double.parseDouble(sPrice1);
		dPrice2 *=
		
		inputCount++;
				
		dSum = dPrice1 + dPrice2 + dPrice3;
		
		sum = (int) dSum;
		average = sum/inputCount;
		
		System.out.println("①から③の合計は税込み"+ sum + "円です。");
		System.out.println("①から③の平均金額は税込み" + average + "円です。");
		
		
		
		//①入力値を文字列で受け取る②文字列から浮動小数点型に型変換　③消費税をかける。（double...)
		//④input Countを増やす（せっかくあるので使う）
		//⑤消費税込みの金額を合計　⑥⑤の金額を整数型に型変換する
		//⑦⑥のぉm額を入力
	}

}
