package P3.Tugas;

public class DataDosen08 {

    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        System.out.println("\n===== Data Semua Dosen =====");
        for (Dosen08 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("--------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin)
                pria++;
            else
                wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jmlPria++;
            } else {
                totalUsiaWanita += d.usia;
                jmlWanita++;
            }
        }
        System.out.println("Rata-rata Usia Pria   : " + (jmlPria > 0 ? (double) totalUsiaPria / jmlPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (jmlWanita > 0 ? (double) totalUsiaWanita / jmlWanita : 0));
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 tertua = arrayOfDosen[0];
        for (Dosen08 d : arrayOfDosen) {
            if (d.usia > tertua.usia)
                tertua = d;
        }
        System.out.println("Dosen Paling Tua: " + tertua.nama + " (" + tertua.usia + " tahun)");
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 termuda = arrayOfDosen[0];
        for (Dosen08 d : arrayOfDosen) {
            if (d.usia < termuda.usia)
                termuda = d;
        }
        System.out.println("Dosen Paling Muda: " + termuda.nama + " (" + termuda.usia + " tahun)");
    }
}