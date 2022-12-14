import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        System.out.print("n1 Sayısını giriniz: ");
        int no1 = mec.nextInt();

        System.out.print("n2 Sayısısını giriniz: ");
        int no2 = mec.nextInt();

        int n1 = 1, n2 = 2;
        int ekok = 0;
        int ebob = 1;

        if (no1 <= no2) {
            n1 = no1;
            n2 = no2;
        } else {
            n1 = no2;
            n2 = no1;
        }
        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }i++;
        }
        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ebob);

        int k = 1;
        while (k <= n1 * n2) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
            }k++;
        }
        System.out.println(n1 + " ve " + n2 + " sayılarının EKOK'u: " + ekok);
    }
}