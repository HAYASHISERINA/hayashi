
package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

    public static void main(String[] args) {

    	// Q1:D0gクラスを呼び出して変数に代入し、動物の名をニンールに出してくださ
        Dog dog1 = new Dog();
        System.out.println("名前：" + dog1.name);

     // 02：D0gクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください
        Dog dog2 = new Dog(3);
        System.out.println("数：" + dog2.count);

        /// 現在の日時を「yyyy-M-dd Him:s」形式で変数に代入して、コンソールに出力してください
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");

        System.out.println("現在日時：" + now.format(fmt));
    }
}