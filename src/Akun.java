class Akun extends User {
    private final String username;
    private String password;

    public Akun(String userId, String nama, String username, String password) {
        super(userId, nama);
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void tampilkanAkun() {
        tampilkanUser();
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}