package day05.q01;

public class CashRegister {
/**
 * 税込み金額を求める
 */
	public int calcPrice (int calcPrice) {
		System.out.println("商品の税込み金額（消費税10％）を計算します。");
	int p =(int)(calcPrice * 1.1);
	return p;
	}

}
