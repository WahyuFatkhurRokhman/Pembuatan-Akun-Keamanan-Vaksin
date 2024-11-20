class AkunPrioritas extends Akun {
    private int nomorBPJS;

    public AkunPrioritas(String username, String password, int nomorBPJS) {
        super(username, password);
        this.nomorBPJS = nomorBPJS;
    }

    @Override
    public void tampilkanAkun() {
        super.tampilkanAkun();
        System.out.println("Nomor BPJS  : " + nomorBPJS);
        System.out.println("Jenis Akun  : Prioritas");
    }
}
