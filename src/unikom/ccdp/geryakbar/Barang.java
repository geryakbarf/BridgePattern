package unikom.ccdp.geryakbar;

public abstract class Barang {
    protected Penyewaan penyewaan;

    public Barang(Penyewaan penyewaan) {
        this.penyewaan = penyewaan;
    }

    public abstract void addToChart(String nama, int durasi, String kontak);
}
