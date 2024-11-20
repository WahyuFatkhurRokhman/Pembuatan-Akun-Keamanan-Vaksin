class AkunReguler extends Akun {

    public AkunReguler(String username, String password) {
        super(username, password);
    }

    @Override
    public void tampilkanAkun() {
        super.tampilkanAkun();
        System.out.println("Jenis Akun  : Reguler");
    }
}