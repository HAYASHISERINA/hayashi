package curriculum_B;

import java.util.Scanner;

public class Qes1_6 {

	public static void main(String[] args) {
		//Q6入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		//・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
		//・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
		//・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		//・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		//・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		//・入力された値は「、」区切りで指定してください
		//・そのほかの値が入力された場合下記を出力されるようにしてください
		//『受け取った値』は指定の商品ではありません
		//・残り台数は0〜11までのランダムな値が出力されるようにしてください
		//パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] items = input.split(",");

		for (String item : items) {

			switch (item) {

			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int stock = (int) (Math.random() * 12);
				System.out.println(item + "の残り台数は" + stock + "台です");
				break;

			case "テレビ":
			case "ディスプレイ":
				int random = (int) (Math.random() * 12);
				int tvStock = (random <= 11) ? 11 - random : 0;
				System.out.println(item + "の残り台数は" + tvStock + "台です");
				break;

			default:
				System.out.println("「" + item + "」は指定の商品ではありません");

			}

		}
		scanner.close();

	}
}
	


