package P10.Tugas;

public class AntrianLayanan08 {
    Mahasiswa08[] data;
    int front, rear, size, max;
    int jumlahSudahKRS = 0; 

    public AntrianLayanan08(int n) {
        max = n;
        data = new Mahasiswa08[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa08 mhs) {
        if (isFull()) {
            System.out.println("Antrean Penuh! Maksimal 10 mahasiswa.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " telah masuk antrean.");
        }
    }

    public void panggilAntreanKRS() {
        if (isEmpty()) {
            System.out.println("Antrean kosong!");
        } else {
            int jmlDiproses = (size >= 2) ? 2 : 1;
            System.out.println("Memproses KRS untuk " + jmlDiproses + " mahasiswa...");
            
            for (int i = 0; i < jmlDiproses; i++) {
                Mahasiswa08 m = data[front];
                System.out.print("Selesai KRS: ");
                m.tampilkanData();
                
                front = (front + 1) % max;
                size--;
                jumlahSudahKRS++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            System.out.println("Daftar Antrean Saat Ini:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            int limit = (size >= 2) ? 2 : 1;
            System.out.println("2 Mahasiswa di urutan terdepan:");
            for (int i = 0; i < limit; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            System.out.print("Antrean paling akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void cetakStatus() {
        System.out.println("------------------------------------");
        System.out.println("Jumlah mahasiswa dalam antrean : " + size);
        System.out.println("Total mahasiswa sudah proses KRS: " + jumlahSudahKRS);
        System.out.println("------------------------------------");
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrean telah dikosongkan.");
    }
}