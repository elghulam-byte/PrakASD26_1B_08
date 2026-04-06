package P6.Tugas;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        DataDosen08 daftarDosen = new DataDosen08(kapasitas);

        for (int i = 0; i < kapasitas; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kd = sc.nextLine();
            System.out.print("Nama          : ");
            String nm = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            String jkInput = sc.nextLine();
            boolean jk = jkInput.equalsIgnoreCase("L");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            Dosen08 d = new Dosen08(kd, nm, jk, usia);
            daftarDosen.tambah(d);
        }

        System.out.println("\n=================================");
        System.out.println("DATA DOSEN SEBELUM SORTING");
        System.out.println("=================================");
        daftarDosen.tampil();

        System.out.println("\n=================================");
        System.out.println("DATA SETELAH BUBBLE SORT (ASC - USIA)");
        System.out.println("=================================");
        daftarDosen.sortingASC();
        daftarDosen.tampil();

        System.out.println("\n=================================");
        System.out.println("DATA SETELAH SELECTION SORT (DSC - USIA)");
        System.out.println("=================================");
        daftarDosen.sortingDSC();
        daftarDosen.tampil();
        
        sc.close();
    }
}