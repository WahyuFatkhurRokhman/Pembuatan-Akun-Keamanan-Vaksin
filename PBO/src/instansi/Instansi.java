package instansi;

class Instansi {
    public String instansi;
    public String provinsi;
    public String kota;
    public String kecamatan;
    public String kelurahan;
    public String alamat;

    public Instansi(String instansi, String provinsi, String kota, String kecamatan, String kelurahan, String alamat) {
        this.instansi = instansi;
        this.provinsi = provinsi;
        this.kota = kota;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.alamat = alamat;
    }

    public String getInstansi() {
        return instansi;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public String getKota() {
        return kota;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public String getKelurahan() {
        return kelurahan;
    }


    public String getAlamat() {
        return alamat;
    }

    public void tampilkanInfo() {
        System.out.println("Instansi  : " + instansi);
        System.out.println("Provinsi  : " + provinsi);
        System.out.println("Alamat    : " + alamat);
        System.out.println("Kota      : " + kota);
        System.out.println("Kecamatan : " + kecamatan);
        System.out.println("Kelurahan : " + kelurahan);

    }

    /*public static Instansi pilihInstansi(String  instansi, String namaInstansi, String provinsi, String kecamatan, String kelurahan, String alamat) {
        switch (instansi.toLowerCase()) {
            case "Klinik":
                return new Klinik(instansi, namaInstansi, provinsi, kecamatan, kelurahan, alamat);
            case "Puskesmas":
                return new Puskesmas(instansi, namaInstansi, provinsi, kecamatan, kelurahan, alamat);
            case "RumahSakitSwasta":
                return new RumahSakitSwasta(instansi, namaInstansi, provinsi, kecamatan, kelurahan, alamat);
            case "RumahSakitUmumDaerah":
                return new RumahSakitSwasta(instansi, namaInstansi, provinsi, kecamatan, kelurahan, alamat);
            case "RumahSakitUmumPusat":
                return new RumahSakitUmumPusat(instansi, namaInstansi, provinsi, kecamatan, kelurahan, alamat);
            default:
                System.out.println("Jenis Instansi tidak ada");
                return null;
        }
    }*/
}