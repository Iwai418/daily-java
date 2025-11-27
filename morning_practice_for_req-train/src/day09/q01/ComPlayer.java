package day09.q01;

import java.io.IOException;
public class ComPlayer implements Playable {

	private String name = "コンピューター";

	//@override
	public int doJanken() throws IOException{
		//0-2を代入
		int num = (int) Math.random()*3;
		String janken[]= {"グー","チョキ","パー"};
		
		System.out.println(name + "は" + janken[num] + "を選んだ");
		return num;
	}

}
