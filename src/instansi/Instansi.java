package instansi;

public abstract class Instansi {
    private String alamat;
    private String kelurahan;
    private String kecamatan;
    private String kota;
    private String provinsi;

    public Instansi(String alamat, String kelurahan, String kecamatan, String kota, String provinsi) {
        this.alamat = alamat;
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.kota = kota;
        this.provinsi = provinsi;
    }

    public abstract void tampilkanInfo();

    public String getAlamat() {
        return alamat;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public String getKota() {
        return kota;
    }

    public String getProvinsi() {
        return provinsi;
    }
}