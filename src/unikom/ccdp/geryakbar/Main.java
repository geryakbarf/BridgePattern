package unikom.ccdp.geryakbar;

public class Main {

    public static void main(String[] args) {
	    String namaPenyewa = "Gery Akbar Fauzi";
	    int durasiSewa = 5;
	    String kontakPenyewa = "+6285156038495";

	    Barang kamera = new Kamera(new Gold());
	    Barang tripod = new Tripod(new Bronze());

	    kamera.addToChart(namaPenyewa,durasiSewa,kontakPenyewa);
	    tripod.addToChart(namaPenyewa,durasiSewa,kontakPenyewa);
    }
}
