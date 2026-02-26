//1・コンソールにユーザー名を入力できるようにしてください
package curriculum_B;

import java.util.Scanner;

public class Q {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("名前を入力してください");

        String name = scanner.nextLine();
       
        System.out.println("こんにちは、" + name );
        
 //ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
 //ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
 //ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
 //2ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
if (name.length() == 0) {
    System.out.println("名前を入力してください"); 
 } else if (name.length() > 10) {
        System.out.println("名前を10文字以内にしてください");  
 } else if (! name.matches("^{a-zA-Z0-9}+$" )) {
	 System.out.println("半角英数字のみで名前を入力してください");
 } else {
	System.out.println("ユーザー名「 " + name + " 」を登録しました");
 }
    }
}


