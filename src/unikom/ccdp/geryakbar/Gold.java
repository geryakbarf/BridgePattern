package unikom.ccdp.geryakbar;

public class Gold implements Penyewaan {
    @Override
    public void pilihPaket(String nama, int durasi, String kontak) {
        System.out.println("===Paket Penyewaan Telah Diterima===");
        System.out.println("Paket Penyewaan : Gold");
        System.out.println("Nama Penyewa : " + nama);
        System.out.println("Durasi : " + durasi + " hari");
        System.out.println("Kontak Penyewa : " + kontak);
        System.out.println("Gold Benefit : Gratis Jasa Edit Foto");
    }
}
