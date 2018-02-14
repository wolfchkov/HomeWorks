package home.kravchenko;


import java.util.Scanner;

public class Home_Work_02_01 {
    private static final String COURSE = "Course: Java core";
    private static final String STUDENT = "Student";
    private static final String START_LINE = "* ";
    private static final String END_LINE = " *";
    private static final int COURSE_LENGTH = COURSE.length();


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = console.nextLine();
        int max_length = COURSE_LENGTH;

        if (fullName.length() > max_length) {
            max_length = fullName.length();
        }
        printLine(max_length);
        print(COURSE, max_length);
        print(STUDENT, max_length);
        print(fullName, max_length);
        printLine(max_length);


    }

    private static void printLine(int max_length) {
        for (int i = 0; i < max_length + 4; i++) {
            System.out.print("*");

        }
        System.out.println("");
    }

    private static void print(String line, int max_length) {
        int start = 0;
        int end = 0;

        int sum = max_length - line.length();

        if (sum != 0) {
            if (sum % 2 == 0) {
                start = sum / 2;
                end = start;
            } else {
                sum = sum - 1;
                start = sum / 2;
                end = start + 1;
            }
        }

        System.out.print(START_LINE);
        printSpaces(start);
        System.out.print(line);
        printSpaces(end);
        System.out.print(END_LINE);
        System.out.println("");


    }
    private  static  void printSpaces (int countOfSpaces){
        for (int i = 0; i <countOfSpaces; i++) {
            System.out.print(" ");

        }

    }
}

