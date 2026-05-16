package P11.Tugas;

import java.util.Scanner;

public class MainAntrian08 {
    public static void main(String[] args) {
        QueueLinkedList08 antrian = new QueueLinkedList08();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Mendaftar)");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Depan & Belakang");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(new MahasiswaAntri08(nim, nama));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.display();
                    break;
                case 5:
                    antrian.clear();
                    break;
            }
        } while (pilih != 6);
        sc.close();
    }
}
