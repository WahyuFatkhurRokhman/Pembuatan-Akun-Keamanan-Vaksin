public class User {
    protected String userId;
    protected String nama;

    public User(String userId, String nama) {
        this.userId = userId;
        this.nama = nama;
    }

    public void tampilkanUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Nama: " + nama);
    }
}