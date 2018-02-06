import java.util.Scanner;

/**
 * Created by admin on 2/2/2018.
 */
public class Zadacha2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введи  время в минутах : ");
        double vremya =  vvod.nextDouble();

        System.out.println("Введи расстаяние в км: ");
        double rasstayanie =  vvod.nextDouble();

        double result1 = res(vremya, rasstayanie);
        System.out.println("результат задачи  =  " + result1);
}
    public static double res (double vremya, double rasstayanie){
        double rasM = rasstayanie * 1000;
        double vre= vremya * 60;
        double time = rasM/ vre;
        return time;

    }
}