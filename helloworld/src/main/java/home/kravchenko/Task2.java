package home.kravchenko;

public class Task2 {
    public static void main(String[] args) {
        /*
        int i= 45685;

        int r = i%10;
        System.out.println(r);
        int s = i/10;
        int d  = s%10;
        System.out.println(d);
        int t =  s/10;
        */


        int f = 45685;
        for (int j = 0; j <5 ; j++) {
            int g = f%10;
            System.out.println(g);
            int q =  f/10;
            f = q;
        }
    }
}
