package sample;
//・コンソールにユーザー名を入力できるようにしてください
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("名前を入力してください:");

        String name = scanner.nextLine();

        System.out.println("こんにちは、" + name + "さん");

        scanner.close();

    }

}
