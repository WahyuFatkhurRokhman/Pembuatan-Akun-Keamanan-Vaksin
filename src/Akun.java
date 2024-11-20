class Akun {
    private final String username;
    private String password;

    public Akun(String username, String password) {
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
        System.out.println("Username    : " + username);
        System.out.println("Password    : " + password);
    }
}