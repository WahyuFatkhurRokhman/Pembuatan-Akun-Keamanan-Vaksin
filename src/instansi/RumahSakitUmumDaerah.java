package instansi;

public class RumahSakitUmumDaerah extends Instansi {
    public String namaInstansi;


    public RumahSakitUmumDaerah(String instansi, String namaInstansi, String provinsi, String kota, String kecamatan, String kelurahan, String alamat) {
        super(instansi, provinsi, kota, kecamatan, kelurahan, alamat);
        this.namaInstansi = namaInstansi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama instansi : " + namaInstansi);
        /*System.out.println("Rumah Sakit Umum Daerah " + getInstansi());
        System.out.println("Provinsi        : " + getProvinsi());
        System.out.println("Kota            : " + getKota());
        System.out.println("Kecamatan       : " + getKecamatan());
        System.out.println("Kelurahan       : " + getKelurahan());
        System.out.println("Alamat          : " + getAlamat());*/
    }
}