package home.kravchenko;
/**
 * Created by admin on 2/13/2018.
 */
public class recur {
    public static void main(String[] args) {
        rec(79);
    }
    public  static void rec(int i ){
        System.out.println(i);
        if (i>= 100){
            return;
        }
        rec(i+1);
    }
}
