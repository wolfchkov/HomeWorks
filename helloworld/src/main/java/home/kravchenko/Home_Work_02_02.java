package home.kravchenko;


import java.util.Scanner;

public class Home_Work_02_02 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        long input = console.nextLong();
        input = Math.abs(input);

        flawNumber(input);
    }

    public static void flawNumber(long input) {
        long min = input % 10;
        long max = input % 10;
        long rest = input / 10;

        while (rest > 0) {

            long temp = rest % 10;
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
            rest = rest / 10;
        }
        System.out.println("минимальная цифра " + min);
        System.out.println("максимальная цифра " + max);


    }

}
