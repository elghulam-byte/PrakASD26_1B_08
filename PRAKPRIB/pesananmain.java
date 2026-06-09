package PRAKPRIB;

import java.util.Scanner;

public class pesananmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pesanan[] namapesanan = {
            new pesanan("kopi", 5000),
            new pesanan("roti", 5000),
            new pesanan("Kentang Goreng ", 7000),
            new pesanan("cireng", 8000),
        };
        int pilih;
        do {
            System.out.println("== MENU ==");
            System.out.println("1. Tampilkan Pesanan");
            System.out.println("2. Hitung Pesanan");
            System.out.println("3. Hitung total");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch(pilih){
                case 1:
                    System.out.println("\nDaftar Pesanan");
                    for (pesanan p : namapesanan) {
                        System.out.println("Pesanan: " + p.namapesanan);
                    } break;
                case 2:
                    System.out.println("\nHitung Pesanan");
            }       for (pesanan p : namapesanan) {
                    System.out.println("Harga: ");
            }
        } while (pilih != 0);
    }
}   
