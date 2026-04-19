package curriculum_B;

import java.util.Scanner;  
//N人の生徒の成績を管理するプログラムを下記条件で作成してください
//・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
//・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
//・このプログラムの実行は必ず1回以上行われるようにしてください
//・出力例を参考にプログラミングを作成してください

public class Qes_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n ;
        do {

		        System.out.print("生徒の人数を入力してください（2以上）：");
		        n = scanner.nextInt();
        } while (n < 2 );

		        int sumEnglish = 0;
		        int sumMath = 0;
		        int sumScience = 0;
		        int sumSocial = 0;

		        int totalAll = 0;

		        for (int i = 1; i <= n; i++) {

		            System.out.print(i + "人目の英語の点数：");
		            int e = scanner.nextInt();

		            System.out.print(i + "人目の数学の点数：");
		            int m = scanner.nextInt();

		            System.out.print(i + "人目の理科の点数：");
		            int s = scanner.nextInt();

		            System.out.print(i + "人目の社会の点数：");
		            int so = scanner.nextInt();

		            // 合計に足す
		            sumEnglish += e;
		            sumMath += m;
		            sumScience += s;
		            sumSocial += so;

		            int total = e + m + s + so;
		            totalAll += total;

		            double avg = total / 4.0;
		            System.out.println(i + "人目の平均点は" + avg + "点です。");
		        }

		        // 教科ごとの平均
		        System.out.println("英語の平均点は" + (sumEnglish / (double)n) + "点です。");
		        System.out.println("数学の平均点は" + (sumMath / (double)n) + "点です。");
		        System.out.println("理科の平均点は" + (sumScience / (double)n) + "点です。");
		        System.out.println("社会の平均点は" + (sumSocial / (double)n) + "点です。");

		        // 全体平均
		        double overall = totalAll / (double)(n * 4);
		        System.out.println("全体の平均点は" + overall + "点です。");
		        scanner.close();
		    }
}


		

	

