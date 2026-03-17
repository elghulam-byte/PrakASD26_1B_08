package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Pangkat08[] png = new Pangkat08[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("masukkan nilai basis elemen ke- " + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("masukkan nilai pangkat elemen ke- " + (i + 1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat08(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.PangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.PangkatDC(p.nilai, p.pangkat));
        }
    }
}
