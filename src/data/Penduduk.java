package data;

public class Penduduk {
    private String nama;
    private int umur;

    public Penduduk(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanPenduduk() {
        System.out.println("Nama            : " + nama);
        System.out.println("Umur            : " + umur);
    }
}