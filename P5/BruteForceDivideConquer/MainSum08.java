package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Sum08 sm = new Sum08(elemen);
        for (int i=0; i<elemen; i++) {
            System.out.print("masukkan keuntungan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan,0, elemen-1));
    }
}
