package sample;

public class Dog {

		//Q1フィイールドに動物の名前の変数を定義してください。
	
	 String name;


		//02フィールドに動物の数の変数を定義してください。
 int count;

	    // Q3Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
	        name = "犬";
	    }

	// Q4 Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog (int count) {
	        this.count = count;
	    }
}


