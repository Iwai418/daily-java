package day08.q01;

public class Sorcerer {

	//問題回答
	public class Sorcerer extends Magic {
		
		/**
		* コンストラクタ
		*/
		public Sorcerer(String name) {
			Super(name);
	}
	/*
	 * @ovevrride
	 */
		public void attack(int mp) {
			super.attack(mp);
			System.out.println("\n" + name + "の攻撃！！");
			int addDamege = (int) (Math.random() * mp)*0.5;
			System.out.println("追加で" + addDamege + "のダメージ！！");
		
		}
	}
}
