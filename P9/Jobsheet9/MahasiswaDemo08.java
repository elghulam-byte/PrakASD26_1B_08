package P9.Jobsheet9;
import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("nama: ");
                    String nama = scan.nextLine();
                    System.out.print("nim: ");
                    String nim = scan.nextLine();
                    System.out.print("kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                
                case 2:
                    Mahasiswa08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa08 bawah = stack.peek();
                    if (bawah != null) {
                        System.out.println("Mahasiswa pertama yang mengumpulkan adalah : " + bawah.nama);
                    }
                    break;
                case 6:
                    int jumlah = stack.jumlahTugas();
                    System.out.println("Jumlah tugas yang ada di tumpukan saat ini: " + jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}