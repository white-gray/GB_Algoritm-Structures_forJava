package HW_lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*
 * Ввод строки
 * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = sc.nextLine();
/*
* отправка данных в стек
* */
        Stack simbolsOfText = new Stack(text.length());
        String[] arrayFromText = text.split("");
        for (int i=0;i<arrayFromText.length;i++) {
            simbolsOfText.push(arrayFromText[i]);
        }
        for (int i=0;i<simbolsOfText.length();i++) {
            System.out.printf(simbolsOfText.pop());
        }

    }
}
