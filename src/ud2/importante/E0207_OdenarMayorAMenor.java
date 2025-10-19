package ud2.importante;

import java.util.Scanner;
/**
 * @author AmerCz.
 */
public class E0207_OdenarMayorAMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero1: ");
        int n1 = sc.nextInt();

        System.out.print("Numero2: ");
        int n2 = sc.nextInt();

        System.out.print("Numero3: ");
        int n3 = sc.nextInt();
        sc.close();

        /*
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + "" + n2 + "" + n3);

        } else if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + "" + n3 + "" + n2);

        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n2 + "" + n1 + "" + n3);

        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n2 + "" + n3 + "" + n1);

        } else if (n3 > n1 && n3 > n2 && n1 > n2) {

            System.out.println(n3 + "" + n1 + "" + n2);
        }  else {
            System.out.println(n3 + "" + n2 + "" + n1);
        }*/

        
        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println(n1 + "" + n2 + "" + n3);
            } else {
                System.out.println(n1 + "" + n3 + "" + n2);
            }
        } else if (n2 > n1 && n2 > n3){
            if (n1 > n3) {
                System.out.println(n2 + "" + n1 + "" + n3);
            } else {
                System.out.println(n2 + "" + n3 + "" + n1);
            }
        } else {
            if (n1 > n2) {
                System.out.println(n3 + "" + n1 + "" + n2);
            } else {
                System.out.println(n3 + "" + n2 + "" + n1);
            }
        }
    }
}
