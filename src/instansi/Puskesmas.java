package instansi;

public class Puskesmas extends Instansi {
    private String namaPuskesmas;

    public Puskesmas(String namaPuskesmas, String alamat, String kelurahan, String kecamatan, String kota, String provinsi) {
        super(alamat, kelurahan, kecamatan, kota, provinsi);
        this.namaPuskesmas = namaPuskesmas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Puskesmas  : " + namaPuskesmas);
        System.out.println("Alamat          : " + getAlamat());
        System.out.println("Kelurahan       : " + getKelurahan());
        System.out.println("Kecamatan       : " + getKecamatan());
        System.out.println("Kota            : " + getKota());
        System.out.println("Provinsi        : " + getProvinsi());
    }
}