package unikom.ccdp.geryakbar;

public class Tripod extends Barang{
    public Tripod(Penyewaan penyewaan) {
        super(penyewaan);
    }

    @Override
    public void addToChart(String nama, int durasi, String kontak) {
        penyewaan.pilihPaket(nama,durasi,kontak);
    }
}
