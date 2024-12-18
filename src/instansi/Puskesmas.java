package instansi;

public class Puskesmas extends Instansi {
    public String puskesmas;

    public Puskesmas(String instansi, String provinsi, String kota, String kecamatan, String kelurahan, String puskesmas, String alamat) {
        super(instansi, provinsi, kota, kecamatan, kelurahan, alamat);
        this.puskesmas = puskesmas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Puskesmas : " + puskesmas);
        /*System.out.println("Puskesmas " + getInstansi());
        System.out.println("Provinsi        : " + getProvinsi());
        System.out.println("Kota            : " + getKota());
        System.out.println("Kecamatan       : " + getKecamatan());
        System.out.println("Kelurahan       : " + getKelurahan());
        System.out.println("Alamat          : " + getAlamat());*/
    }
}