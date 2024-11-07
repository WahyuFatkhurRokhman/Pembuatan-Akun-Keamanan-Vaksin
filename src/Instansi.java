class Instansi extends User {
    private final String pilihInstansi;
    private final String provinsi;
    private final String kota;
    private final String kelurahan;
    private final String alamat;

    public Instansi(String userId, String nama, String pilihInstansi, String provinsi, String kota, String kelurahan, String alamat) {
        super(userId, nama);
        this.pilihInstansi = pilihInstansi;
        this.provinsi = provinsi;
        this.kota = kota;
        this.kelurahan = kelurahan;
        this.alamat = alamat;
    }

    public void tampilkanInstansi() {
        tampilkanUser();
        System.out.println("Nama Instansi   : " + pilihInstansi);
        System.out.println("Provinsi        : " + provinsi);
        System.out.println("Kota            : " + kota);
        System.out.println("Kelurahan       : " + kelurahan);
        System.out.println("Alamat          : " + alamat);
    }
}