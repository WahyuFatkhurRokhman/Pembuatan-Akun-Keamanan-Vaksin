class Instansi extends User {
    private final String pilihInstansi;
    private final String provinsi;
    private final String kota;
    private final String kecamatan;
    private final String kelurahan;
    private final String alamat;

    public Instansi(String userId, String nama, String pilihInstansi, String provinsi, String kota, String kecamatan, String kelurahan, String alamat) {
        super(userId, nama);
        this.pilihInstansi = pilihInstansi;
        this.provinsi = provinsi;
        this.kota = kota;
        this.kecamatan = kecamatan;
        this.kelurahan = kelurahan;
        this.alamat = alamat;
    }

    public void tampilkanInstansi() {
        tampilkanUser();
        System.out.println("Nama Instansi   : " + pilihInstansi);
        System.out.println("Provinsi        : " + provinsi);
        System.out.println("Kota            : " + kota);
        System.out.println("Kecamatan       : " + kecamatan);
        System.out.println("Kelurahan       : " + kelurahan);
        System.out.println("Alamat          : " + alamat);
    }
}