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
        for (int i = 0; i < arrayFromText.length; i++) {
            simbolsOfText.push(arrayFromText[i]);
        }
        /*
         * вывод на экран результата ("перевёрнутая строка")
         * */
        for (int i = 0; i < simbolsOfText.length(); i++) {
            System.out.printf((String) simbolsOfText.pop());
        }
        System.out.println();
        System.out.println(simbolsOfText.toString());


        /*
         * ввод данных в Дек
         * */
        Dec simbolsOfTextInDec = new Dec(text.length());
        int w=0;
        if (simbolsOfTextInDec.length()%2!=0) {
            simbolsOfTextInDec.insertLeft(arrayFromText[w]);
            w++;
        }
        while (w<simbolsOfTextInDec.length())  {
            simbolsOfTextInDec.insertRight(arrayFromText[w]);
            simbolsOfTextInDec.insertLeft(arrayFromText[w+1]);
            w+=2;
        }
        /*
         * вывод на экран результата ("строка d j,t cnjhjys")
         * */
        System.out.println(simbolsOfTextInDec.toString());

        /*
        * удаление
        * */
        simbolsOfTextInDec.removeLeft();
        simbolsOfTextInDec.removeLeft();
        simbolsOfTextInDec.removeRight();
        System.out.println(simbolsOfTextInDec.toString());


    }
    }
