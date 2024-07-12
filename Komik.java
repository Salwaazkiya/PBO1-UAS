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
}
