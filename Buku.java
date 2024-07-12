public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private double harga;  // Mengubah tipe data harga menjadi double agar sesuai dengan metode kenaikan harga


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

    public double getHarga() {  // Mengubah tipe data harga menjadi double
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

    public void setHarga(double harga) {  // Mengubah tipe data harga menjadi double
        this.harga = harga;
    }

    public Buku() {
        System.out.println("Objek Buku telah diciptakan, constructor berjalan");
    }

    public void naikkanHarga() {
        this.harga += 1000; 
        System.out.println("Harga naik sebesar 1000, harga baru: " + this.harga);
    }

    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga naik sebesar " + kenaikan + ", harga baru: " + this.harga);
    }

}
