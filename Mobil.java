public class Mobil {
    private int id;
    private String merek;
    private String model;
    private int tahun;
    private double harga;  // Mengubah tipe data harga menjadi double agar sesuai dengan metode kenaikan harga

    public int getId() {
        return this.id;
    }

    public String getMerek() {
        return this.merek;
    }

    public String getModel() {
        return this.model;
    }

    public int getTahun() {
        return this.tahun;
    }

    public double getHarga() {  // Mengubah tipe data harga menjadi double
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setHarga(double harga) {  // Mengubah tipe data harga menjadi double
        this.harga = harga;
    }

    public Mobil() {
        System.out.println("Objek Mobil telah diciptakan, constructor berjalan");
    }

    public void naikkanHarga() {
        this.harga += 10000; 
        System.out.println("Harga naik sebesar 10000, harga baru: " + this.harga);
    }

    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga naik sebesar " + kenaikan + ", harga baru: " + this.harga);
    }
}