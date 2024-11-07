import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JUNE, 7);
        Date tanggalLahir = cal.getTime();

        Akun akun = new Akun("U001", "Budi Santoso", "budi123", "pass123");
        DataPribadi dataPribadi = new DataPribadi("U001", "Budi Santoso", "budi@example.com", "Jakarta", "Lajang", tanggalLahir , 123456789);
        Instansi instansi = new Instansi("U001", "Budi Santoso", "Universitas XYZ", "Jawa Barat", "Bandung", "Cibiru", "Jl. Pendidikan No. 1");

        System.out.println("=== Informasi Akun ===");
        akun.tampilkanAkun();

        System.out.println("\n=== Informasi Data Pribadi ===");
        dataPribadi.tampilkanDataPribadi();

        System.out.println("\n=== Informasi Instansi ===");
        instansi.tampilkanInstansi();
    }
}