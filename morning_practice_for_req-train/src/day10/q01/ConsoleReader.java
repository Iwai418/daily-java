package day10.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public int inputPIN() throws IOException {
		int pin = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("4ケタの暗証番号を入力して下さい");
		System.out.print("input PIN? >>");
		String inputString = "";

		/* ここに記述 */
		try 
			{
			inputString = br.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			if (!inputString.matches("[0-9]{4}")) {
				throw new IllegalInputException("不正な入力:" +inputString )
			}
		}

		/* 記述終了 */

		pin = Integer.parseInt(inputString);
		return pin;
	}

}
