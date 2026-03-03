package P3.Tugas;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen08[] arrayOfDosen = new Dosen08[3];
        String kode, nama, dummy, jkInput;
        boolean jenisKelamin;
        int usia;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            jkInput = sc.nextLine();
            
            jenisKelamin = jkInput.equalsIgnoreCase("Pria");
            
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("--------------------------------");

            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        int counter = 1;
        for (Dosen08 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------------");
            counter++;
        }
    }
}