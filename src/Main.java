import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JUNE, 7);
        Date tanggalLahir = cal.getTime();

        AkunPrioritas akunPrioritas = new AkunPrioritas("alukard", "alukard123", 123456);
        AkunReguler akunReguler = new AkunReguler("nana", "nana123");

        DataPribadi dataPribadi = new DataPribadi("212", "alukard dingin", "alukard@gmail.com", "Jakarta", "Lajang", tanggalLahir , 621124589);
        Instansi instansi = new Instansi("212", "alukard dingin", "Puskesmas", "DKI Jakarta", "Jakarta Timur", "Cakung", "JatiNegara", "Jl. Raya Bekasi KM no.20, RT.5/RW.11");

        System.out.println("=== Informasi Akun Prioritas ===");
        akunPrioritas.tampilkanAkun();

        System.out.println("\n=== Informasi Akun Reguler ===");
        akunReguler.tampilkanAkun();

        System.out.println("\n=== Informasi Data Pribadi ===");
        dataPribadi.tampilkanDataPribadi();

        System.out.println("\n=== Informasi Instansi ===");
        instansi.tampilkanInstansi();
    }
}