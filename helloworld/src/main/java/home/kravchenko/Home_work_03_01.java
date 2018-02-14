package home.kravchenko;


import java.util.Scanner;

public class Home_work_03_01 {
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите ваш текст: ");
        String input = console.nextLine();
        initialData(input);


    }

    public static void initialData(String input) {

        System.out.println("Выберите один из вариантов преобразования текста и нажмите соответствующую букву: \n" +
                "A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ\n" +
                "B. строка в нижнем регистре\n" +
                "C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )\n" +
                "D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ\n" +
                "E. Как в предложении(с заглавной буквы).\n" +
                "F. выход из программы\n");
        String userChoice = console.nextLine();
        choice(input, userChoice);

    }

    public static void choice(String input, String userChoice) {
        switch (userChoice) {
            case "a":
            case "A":
                System.out.println(toUpperCasre(input));
                break;
            case "b":
            case "B":
                System.out.println(toLowerCase(input));
                break;

            case "c":
            case "C":
                toUpperCaseFirsLetter(input);
                break;
            case "d":
            case "D":
                toLowerCaseFirsLetter(input);
                break;
            case "e":
            case "E":
                sentence(input);
                break;
            case "f":
            case "F":
                exit();
                break;

            default:
                System.out.println("Вы ввели недопустимое значение. Повторите попытку.");
                initialData(input);

        }
    }

    public static String toUpperCasre(String input) {

        return input.toUpperCase();
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static void toUpperCaseFirsLetter(String input) {
        String subStr[];
        String delimetr = " ";
        subStr = input.split(delimetr);

        for (int i = 0; i < subStr.length; i++) {
            System.out.print(subStr[i].substring(0, 1).toUpperCase() + subStr[i].substring(1) + " ");
        }
    }

    public static void toLowerCaseFirsLetter(String input) {
        String subStr[];
        String delimetr = " ";
        subStr = input.split(delimetr);

        for (int i = 0; i < subStr.length; i++) {
            System.out.print(subStr[i].substring(0, 1).toLowerCase() + subStr[i].substring(1).toUpperCase() + " ");
        }
    }

    public static void sentence(String input) {
        String subStr[];
        String delimetr = " ";
        subStr = input.split(delimetr);

        for (int i = 0; i < subStr.length; i++) {
            subStr[0] = subStr[0].substring(0, 1).toUpperCase() + subStr[0].substring(1);
            System.out.print(subStr[i] + " ");
        }
    }

    public static void exit() {
        System.exit(0);
    }
}