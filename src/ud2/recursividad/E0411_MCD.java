package ud2.recursividad;
/**
 * @author AmerCz.
 */
public class E0411_MCD {
    public static void main(String[] args) {
        System.out.println(mcd(10, 25));
        System.out.println(mcd(100, 60));
        System.out.println(mcd(26, 39));
    }    

    private static int mcd(int a, int b) {
        int mcd = 0;

        if (a == 0) {
            mcd = b;            
        } else if (b == 0) {
            mcd = a;
        } else if (b > a) {
            mcd = mcd(a, b - a);
        } else {
            mcd = mcd(a - b, b);
        }

        return mcd;

    }
}
