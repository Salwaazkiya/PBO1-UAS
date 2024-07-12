public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private String harga;

    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public int getJumlahHalaman() {
        return this.jumlah_halaman;
    }

    public String getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Buku() {
        System.out.println("Objek Buku telah diciptakan, constructor berjalan");
    }
}
