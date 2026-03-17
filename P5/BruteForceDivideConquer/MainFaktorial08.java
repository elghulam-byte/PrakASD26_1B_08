package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int nilai = input.nextInt();

        Faktorial08 fk = new Faktorial08();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }

}