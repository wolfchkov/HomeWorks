package home.kravchenko;


import java.util.Scanner;

public class Home_Work_02_03 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите индекс");
        int index = console.nextInt();
        for (int i = 1; i <= index; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
}
