import java.util.Scanner;

/**
 * Created by admin on 2/2/2018.
 */
public class Zadacha {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введи цену одного кг  конфет");
        double cenaKonfet = scan.nextDouble();
        System.out.println("Введи цену одного кг печенья");
        double cenaPechenya = scan.nextDouble();



        double result  = firstZadacha(cenaKonfet, cenaPechenya);
        System.out.println("Результат первой задачи = " + result);

      double result2  = secondZadacha(cenaKonfet, cenaPechenya);
        System.out.println("Результат второй задачи = " + result2);
    }
    public static double firstZadacha(double cenaKonfet, double cenaPechenya){
        double i=  cenaKonfet *0.3;
        double j = cenaPechenya * 0.4;
        double res = i+j;
        return  res;
    }

    public static double secondZadacha (double cenaKonfet, double cenaPechenya){
        double cenaKon  = cenaKonfet * 2;
        double cenaPe = cenaPechenya * 1.8;
        double res = (cenaKon+ cenaPe) * 3;
        return  res;

    }

}
