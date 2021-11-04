package HW_lesson5;

import java.util.Scanner;

public class Erect {
    static int digit, degree;

    public Erect() {
        this.digit = digit;
        this.degree = degree;
    }

    public static int getDigit() {
        return digit;
    }

    public static int getDegree() {
        return degree;
    }

    /*
     * ввод и проверка данных
     * */
    protected static void enterDigits() {
        String[] arrayFromText;
        do {
            String text = enterStrung();
            arrayFromText = text.split(" ");
        }
        while (tests(arrayFromText) != 1);
    }

    /*
     *  проверка, что введено только 2, и именно числа
     * */
    private static int tests(String[] arrayFromText) {
        if (arrayFromText.length != 2) {
            return -1;
        }
        try {
            digit = Integer.valueOf(arrayFromText[0]);
            degree = Integer.valueOf(arrayFromText[1]);
        } catch (Exception err) {
            System.err.println(err.toString()+"\n");
            return -1;
        }
        if (degree < 0) {
            System.out.println("степень не может быть отрицательной!\n");
            return -1;
        }
        return 1;
    }

    /*
     * Ввод строки
     * */
    private static String enterStrung() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа через пробел: ");
        String text = sc.nextLine();
        return text;
    }

    /*
     * рекурсия - возведение в степень
     * */
    protected static int erect(int q) {
        if (degree == 0) {
            return 1;
        }
        degree -= 1;
        q *= digit;
        if (degree < 2) {
            return q;
        }
        return erect(q);
    }
}
