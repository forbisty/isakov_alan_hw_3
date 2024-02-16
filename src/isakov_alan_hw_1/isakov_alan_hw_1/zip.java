package isakov_alan_hw_1.isakov_alan_hw_1;

import java.util.Scanner;

public class zip {public class Main {
    public static void main(String[] args) {
        String testText;
        final int NUM = 1;
        String word = "Crostiano Ronaldo";
        testText = NUM + word;
        System.out.println(NUM + ", " + word + ", " + testText);
        System.out.println("");
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String nameOfUser = scanner.nextLine();
        System.out.println("Привет, " + nameOfUser + "!");


    }}}