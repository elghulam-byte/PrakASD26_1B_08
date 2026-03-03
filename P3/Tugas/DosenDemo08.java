package P3.Tugas;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen08[] arrayOfDosen = new Dosen08[3];
        String kode, nama, jkInput;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            jkInput = sc.nextLine();
            System.out.print("Usia          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------");

            boolean jk = jkInput.equalsIgnoreCase("Pria");
            arrayOfDosen[i] = new Dosen08(kode, nama, jk, usia);
        }

        DataDosen08 dataDosen = new DataDosen08();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}