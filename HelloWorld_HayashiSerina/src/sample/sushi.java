package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class sushi {

    public static void main(String[] args) {

        Food f = new Food();

        System.out.println("こんにちは！ここは" + f.country + "です！");
        System.out.println("この" + f.food + "はうまい");
        System.out.println(f.food + "は" + f.type + "です");

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println(
                "今の現在日時は" + now.format(fmt) + "です"
        );
    }
}