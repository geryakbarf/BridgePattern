package unikom.ccdp.geryakbar;

public class Kamera extends Barang{

    public Kamera(Penyewaan penyewaan) {
        super(penyewaan);
    }

    @Override
    public void addToChart(String nama, int durasi, String kontak) {
        penyewaan.pilihPaket(nama,durasi,kontak);
    }
}
