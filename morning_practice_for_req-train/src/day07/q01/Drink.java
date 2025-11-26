package day07.q01;

/**
 * 飲料水のオブジェクトを生成
 */
public class Drink {
	/**値段*/
	private int price;
	
	/**麦茶*/
	private String name;
	
	//初期値を与えたい
	/**コンストラクタ*/
	public Drink() {
		this.price = 120;
		this.name = "ビタミン麦茶";
		
	}
	/**コンストラクタ引数あり*/
	public Drink(int price, String name) {
		super();
		this.price = price;
		this.name = name;
		
		
	}
	
	public void show() {
		System.out.println(name + ":" + price +"円です。");
//		System.out.println(name2: + price2 +"円です。");
//		System.out.println(name3: + price3 +"円です。");
	}
	
	
}







//引数ありと引数なし２パターンエクリプスで作る