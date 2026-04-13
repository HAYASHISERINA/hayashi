package curriculum_B;

import java.util.Objects;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		String name = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください");
		while (true) {

			name = scanner.nextLine();

			

			//ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
			if (name.length() == 0 || Objects.isNull(name)) {
				System.out.println("名前を入力してください");

				//ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
			} else if (name.length() > 10) {
				System.out.println("名前を10文字以内にしてください");

				//ユーザー名の文字数が10文字より大きい場合「半角英数字のみで名前を入力してください」と出力してください
			} else if (!name.matches("^[a-zA-Z0-9]+$")) {
				System.out.println("半角英数字のみで名前を入力してください");

				//ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました");
				break;
			}
		}

		//Q3じゃんけんのシステムを下記の条件で作成してください
		//・一回ごとに自分の手と相手の手を下記の通り出力してください
		//ユーザー名「name」を登録しました
		//「0はグー、1：チョキ、2：パー」とすること
		//nameの手は「パー」
		//相手の手は「グー」
		//・条件分岐の設定
		//・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
		//やるやん.
		//次は俺にリベンジさせて
		//・自分がじゃんけんでグーに負けた場合、下記が出力されるようにしてください
		//俺の勝ち！
		//負けは次につながるチャンスです！
		//ネバーギブアップ！
		//・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
		//俺の勝ち！
		//たかがじゃんけん、そう思ってないですか？
		//それやったら次も、俺が勝ちますよ
		//・自分がじゃんけんでパーに負けた場合、下記が出力されるようにしてください
		//俺の勝ち！
		//なんで負けたか、明日まで考えといてください。
		//そしたら何かが見えてくるはずです
		//・あいこの場合、下記が出力されるようにしてください
		//DRAW あいこ もう一回しましょう！

		int myHand;
		int enemyHand;
		boolean win = false;
		int count = 0;

		String[] Hands = { "グー", "チョキ", "パー" };

		while (!win) {

			count++;

			
			
			 enemyHand = (int) (Math.random() * 3);
			 myHand = (int) (Math.random() * 3);

			System.out.println(name + "の手は「" + Hands[myHand] + "」");
			System.out.println("相手の手は「" + Hands[enemyHand] + "」");

			if (myHand == enemyHand) {
				System.out.println("DRAW あいこ もう一回！");
			} else if ((myHand == 0 && enemyHand == 1) ||
					(myHand == 1 && enemyHand == 2) ||
					(myHand == 2 && enemyHand == 0)) {
				System.out.println("やるやん。次は俺にリベンジさせて");
				win = true;
			} else {

				if (myHand == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次に繋がるチャンスです！");
					System.out.println("ネバーギブアップ！");
				} else if (myHand == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				} else if (myHand == 2) {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日までに考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}
			}

			
		}
		System.out.println("勝つまでにかかった回数は" + count + "回です");
		scanner.close();
	}
	
	
}

