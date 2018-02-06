package home.kravchenko;

public class Task1 {
    public static void main(String[] args) {

        //int
        int i = equal1(4, 5, 6, 2);
        System.out.println("result int:  " + i);
        //long
        long l = equal2(6748, 12389239, -3244, 234);
        System.out.println("result long: " + l);
        //float
        float f = equal3(312.33f, 112.65f, 3.3f, 87.34f);
        System.out.println("result float: " + f);
        //double
        double d = equal4(65345.345, 3552.347, 2345.51, 765.6);
        System.out.println("result double:  " + d);
    }

    public static int equal1(int x, int y, int z, int n) {
        int result = (x - (50 + y * z) * n) + x;
        return result;
    }

    public static long equal2(long x, long y, long z, long n) {
        long result = x + (y - 100) * z / n;
        return result;
    }

    public static float equal3(float x, float y, float z, float n) {
        float result = x * (y / (z - 1) + 555) - n;
        return result;
    }

    public static double equal4(double x, double y, double z, double n) {
        double result = -x / y + z * (n + 1);
        return result;
    }
}
