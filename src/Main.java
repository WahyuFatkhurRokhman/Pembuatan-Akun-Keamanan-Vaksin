import akun.AkunPrioritas;
import akun.AkunReguler;
import data.DataPenduduk;
import instansi.Puskesmas;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JUNE, 7);
        Date tanggalLahir = cal.getTime();

        AkunPrioritas akunPrioritas = new AkunPrioritas("alukard", "alukard123", 123456);
        AkunReguler akunReguler = new AkunReguler("nana", "nana123");

        DataPenduduk dataPenduduk = new DataPenduduk("Alukard", 23, "alukard@gmail.com", "Jakarta", "Lajang", tanggalLahir, 621124589);
        Puskesmas puskesmas = new Puskesmas("Puskesmas Kalirungkut", "Rungkut Puskesmas No.1", "Kali Rungkut", "Rungkut", "Surabaya", "Jawa Timur");

        System.out.println("=== Informasi Akun Prioritas ===");
        akunPrioritas.tampilkanAkun();

        System.out.println("\n=== Informasi Akun Reguler ===");
        akunReguler.tampilkanAkun();

        System.out.println("\n=== Informasi Penduduk ===");
        dataPenduduk.tampilkanPenduduk();

        System.out.println("\n=== Informasi Instansi ===");
        puskesmas.tampilkanInfo();
    }
}