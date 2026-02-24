package P1;

import java.util.Scanner;

public class cobaproyek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMK;
        System.out.println("MASUKKAN JUMLAH MK : ");
        jumlahMK = sc.nextInt();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        System.out.print("MASUKKAN NILAI ANGKA MK PANCASILA : ");
        System.out.print("MASUKKAN NILAI ANGKA MKM KTI : ");
        System.out.print("MASUKKAN NILAI ANGKA MK CTPS : ");
        System.out.print("MASUKKAN NILAI ANGKA MK MATDAS : ");
        System.out.print("MASUKKAN NILAI ANGKA MK BIG : ");
        System.out.print("MASUKKAN NILAI ANGKA MK DASPRO : ");
        System.out.print("MASUKKAN NILAI ANGKA MK DASPRO PRAKTIKUM : ");
        System.out.print("MASUKKAN NILAI ANGKA MK K3 : ");
    }
}
