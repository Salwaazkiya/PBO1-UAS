public class Komik extends Buku {

    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Komik() {
        System.out.println("Objek Komik telah diciptakan, constructor berjalan");
    }

    public void naikkanHarga() {
        double kenaikan = 2000;  // Misalnya kenaikan harga Komik 2000
        this.setHarga(this.getHarga() + kenaikan);
        System.out.println("Harga Komik naik sebesar " + kenaikan + ", harga baru: " + this.getHarga());
    }
}
