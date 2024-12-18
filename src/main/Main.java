package main;

import akun.*;
import data.DataPribadi;
import instansi.Puskesmas;

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
        Puskesmas puskesmas = new Puskesmas("Puskesmas", "JAWA TIMUR", "SURABAYA", "RUNGKUT", "RUNGKUT KIDUL", "KALI RUNGKUT", "Rungkut instansi.Puskesmas No.1, Kali Rungkut, Kec. Rungkut, Surabaya, Jawa Timur 60293");

        System.out.println("=== Informasi akun.Akun Prioritas ===");
        akunPrioritas.tampilkanAkun();

        System.out.println("\n=== Informasi akun.Akun Reguler ===");
        akunReguler.tampilkanAkun();

        System.out.println("\n=== Informasi Data Pribadi ===");
        dataPribadi.tampilkanDataPribadi();

        System.out.println("\n=== Informasi instansi.Instansi ===");
        puskesmas.tampilkanInfo();
    }
}