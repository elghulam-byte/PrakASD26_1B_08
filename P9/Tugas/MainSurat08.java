package P9.Tugas;
import java.util.Scanner;

public class MainSurat08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StackSurat08 st = new StackSurat08(10);
        int pilih;

        do{
            System.out.println("\nMenu Layanan Surat Izin:");
            System.out.println("1. terima surat izin");
            System.out.println("2. proses surat izin (Validasi)");
            System.out.println("3. lihat surat izin terakhir");
            System.out.println("4. cari surat izin terakhir");
            System.out.println("5. keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih){
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis Izin: "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi Hari: "); int dur = sc.nextInt();
                    st.push(new Surat08(id, nama, kls, jns, dur));
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    st.cariSurat(cari);
                    break;
            }
        }while(pilih != 5);
    }
}