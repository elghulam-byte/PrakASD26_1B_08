package P7;

public class MahasiswaBerprestasi08 {
    Mahasiswa08[] listMhs;
    int idx;

    MahasiswaBerprestasi08(int jumlah) {
        listMhs = new Mahasiswa08[jumlah];
    }

    void tambah(Mahasiswa08 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampil() {
        for (Mahasiswa08 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("--------------------------------");
            }
        }
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK :" + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data Mahasiswa dengan IPK " + x + "tidak ditemukan ");
        }
    }
}