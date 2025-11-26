package day08.q01;

public class Sorcerer {

	//問題回答
	public class Sorcerer extends Magic class{
		
		/**
		* コンストラクタ
		*/
		public Sorcerer(String name) {
			Super(name);
	}
	//メソッド
		public void attack(int mp) {
			System.out.println("\n" + name + "の攻撃！！");
			int damege = (int) (Math.random() * mp)*0.5;
			System.out.println("相手に" + damege + "のダメージ！！");
		}
	/*
	 * @ovevrride
	 */
		public void show() {
		int magicMp =(Math.random() * mp) *0.5;
		super.show();
		}
}
