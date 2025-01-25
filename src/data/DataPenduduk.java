package data;

import java.util.Date;

public class DataPenduduk extends Penduduk {
    private final String email;
    private final String tempatLahir;
    private final String status;
    private final Date tanggalLahir;
    private final int noTelp;

    public DataPenduduk(String nama, int umur, String email, String tempatLahir, String status, Date tanggalLahir, int noTelp) {
        super(nama, umur);
        this.email = email;
        this.tempatLahir = tempatLahir;
        this.status = status;
        this.tanggalLahir = tanggalLahir;
        this.noTelp = noTelp;
    }

    @Override
    public void tampilkanPenduduk() {
        super.tampilkanPenduduk();
        System.out.println("Email           : " + email);
        System.out.println("Tempat Lahir    : " + tempatLahir);
        System.out.println("Status          : " + status);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("Nomor Telepon   : " + noTelp);
    }
}