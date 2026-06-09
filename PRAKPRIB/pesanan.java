package PRAKPRIB;

public class pesanan {
    String namapesanan;
    int harga;

    pesanan(String namapesanan, int harga){
        this.namapesanan = namapesanan;
        this.harga = harga;
    }

    void tampilPesanan(){
        System.out.println("Nama Pesanan: " + namapesanan + "Harga: " + harga);
    }

    void hitungpesanan(){
        int Harga, JumlahPesanan = 0;
        Harga = JumlahPesanan * harga;
        System.out.println("Nama Pesanan : " + namapesanan + "Harga : " + harga + "harga untuk satuan");

    }
}
