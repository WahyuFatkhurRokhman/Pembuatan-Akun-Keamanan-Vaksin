import java.util.Date;

class DataPribadi extends User {
    private final String email;
    private final String tempatLahir;
    private final String status;
    private final Date tanggalLahir;
    private final int noTelp;

    public DataPribadi(String userId, String nama, String email, String tempatLahir, String status, Date tanggalLahir, int noTelp) {
        super(userId, nama);
        this.email = email;
        this.tempatLahir = tempatLahir;
        this.status = status;
        this.tanggalLahir = tanggalLahir;
        this.noTelp = noTelp;
    }

    public void tampilkanDataPribadi() {
        tampilkanUser();
        System.out.println("Email           : " + email);
        System.out.println("Tempat Lahir    : " + tempatLahir);
        System.out.println("Status          : " + status);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("Nomor Telepon   : " + noTelp);
    }
}