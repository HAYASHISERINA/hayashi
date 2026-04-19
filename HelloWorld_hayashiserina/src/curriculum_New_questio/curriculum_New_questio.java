package curriculum_New_questio;

public class curriculum_New_questio {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void q1(String str, int num) {
    System.out.println(str + " " + num);
	}

    // Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
public static void q2 (int a,int b ) {
	System.out.println ( a * b );
}

    // Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
public static void q3(int [] arr) {
	for (int num : arr ) {
		System.out.println (num);
	}
}

    // Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
public static void q2(int a , int b , int c) {
	System.out.println  (a* b* c);
}

    // Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
// ※0は出力＆格納しないようにしてください。

public static int [] q5(int n ) {
	int[] arr = new int [n];
	
	for (int i =0; i < n; i ++) {
		arr[i]=(int)(Math.random() * 100 ) + 1 ;
		System.out.println (arr[i]);
	}
	return arr;
	}

    // Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
//※小数点以下も表示されるようにしてください。
// ※小数点以下も表示されるようにしてください。
public static double q6(int[] arr) {
    int sum = 0;

    for (int num : arr) {
        sum += num;
    }

    double avg = (double)sum / arr.length;
    System.out.println("平均：" + avg);

    return avg;
}

    
    // Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
// 作成したメソッドをここで呼び出してください
public static void q7(double avg) {
    boolean result = avg >= 50 ? true : false;
    System.out.println(result);
}
public static void main(String[] args) {

    q1("Hello JavaSE", 11);
    
    q2(3, 5);
    
    q2(2, 3, 4);
    
    int[] numbers = {1,2,3};
    
    q3(numbers);

    int[] data = q5(5);

    double avg = q6(data);

    q7(avg);
}
}



