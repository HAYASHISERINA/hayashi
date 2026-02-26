package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//Q1
		// 下記9個をローカル変数として宣言のみしてください
		//・バイト型・短整数型・整数型・長整数型
		//・単精度浮動小数点数型・倍精度浮動小数点数型
		//・文字型・文字列型
		//・ブーリアン型
		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char char1;
		String String1;
		boolean boolean1;

		//Q2
		//それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		byte1 = 0;
		short1 = 0;
		int1 = 0;
		long1 = 0L;
		float1 = 0.0f;
		double1 = 0.0d;
		char1 = '\u0000';
		String1 = null;
		boolean1 = false;

		//Q3
		//初期化をしたそれぞれの変数に下記の値を代入してください
		byte1 = 10;
		short1 = 100;
		int1 = 1000;
		long1 = 10000;
		float1 = 9.5f;
		double1 = 10.5d;
		char1 = 'a';
		String1 = "ハロー";
		boolean1 = true;

		//Q4
		//下記の通りにコンソール出力されるようにしてください
		System.out.println(byte1 + short1 + int1 + long1);
		System.out.println(byte1 * 2);
		System.out.println(char1 + String1 + boolean1);
		System.out.println(byte1 + short1 + int1 + long1);
		System.out.println(byte1 * short1 * int1 * long1);
		System.out.println(double1 / 100);
		System.out.println(byte1 - short1);

		//Q5
		//次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		//　String num="20";
		//　int num1=23;
		//　System.out.println("ハローJAVA"+(num+num1));
		String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

		//Q6『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//ローカル変数に代入し○○に入れてください
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』

		//「初めまして○○です」
		String name = "山田太郎";
		System.out.println("初めまして" + name + "です");

		//「年齢は○○歳です」
		int age = 18;
		System.out.println("年齢は" + age + "です");

		//「身長は○○cmです」
		double height = 170.5;
		System.out.println("身長は" + height + "です");

		//「体重は○○kgです」
		double weight = 62.2;
		System.out.println("体重は" + weight + "kgです");

		//「好きな食べ物は○○です」
		String food = "寿司";
		System.out.println("好きな食べ物は" + food + "です");

		//Q7「BMIは○○です」
		//ただし計算は数値を直書きせず、全て変数を使ってすること
		double bmi = weight / (height * height) * 10000;
		System.out.printf("BMIは %.1f です\n", bmi);

		//Q8
		String name1 = "鈴木一郎";
		System.out.println("初めまして" + name1 + "です");

		int age1 = 24;
		System.out.println("年齢は" + age1 + "です");

		double height1 = 168.5;
		System.out.println("身長は" + height1 + "です");

		double weight1 = 64.2;
		System.out.println("体重は" + weight1 + "kgです");

		String food1 = "オムライス";
		System.out.println("好きな食べ物は" + food1 + "です");

		System.out.printf("BMIは%.1fです" ,weight1 / (height1 * height1) * 10000 );

		//Q9で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		String name2 = "鈴木一郎";
		System.out.println("初めまして" + name2 + "です");

		int age2 = 24;
		age2 += age2;
		System.out.println("年齢は" + age2 + "です");

		double height2 = 168.5;
		height2 += height2;
		System.out.println("身長は" + height2 + "です");

		double weight2 = 64.2;
		weight2 += weight2;
		System.out.println("体重は" + weight2 + "kgです");

		String food2 = "オムライス";
		System.out.println("好きな食べ物は" + food2 + "です");

		System.out.printf("BMIは%.1fです" ,weight2 / (height2 * height2) * 10000 );

		//Q10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		int age3 = 24;
		System.out.println(age1 >= 25);

		//Q11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		String variable1 = String.valueOf(age1);
		String variable2 = String.valueOf(height1);
		String variable3 = String.valueOf(weight1);

		System.out.println(variable1 + variable2 + variable3);

		//Q12 11で変換した【年齢・身長】を整数型に変換して出力してください
		int age4 = Integer.parseInt(variable1);
		double height4 = Double.parseDouble(variable2);

		System.out.println(age4);
		System.out.println(height4);

		//Q13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		//ただしif文は使わないでください
		System.out.println(age4 >= 25 || height4 >= 160);

	}

}
