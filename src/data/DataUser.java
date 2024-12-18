package data;

public class DataUser {
    private String userId;
    private String nama;

    public DataUser(String userId, String nama) {
        this.userId = userId;
        this.nama = nama;
    }

    public void tampilkanDataUser() {
        System.out.println("data.User ID    : " + userId);
        System.out.println("Nama            : " + nama);
    }
}