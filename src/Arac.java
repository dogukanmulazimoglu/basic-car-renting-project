abstract class Arac {
    private String marka;
    private String model;
    private int yil;
    private double fiyat;
    private boolean musaitlik;

    public Arac(String marka, String model, int yil, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.musaitlik = true;
    }

    public String getMarka() {
        return this.marka;
    }

    public String getModel() {
        return this.model;
    }

    public int getYil() {
        return this.yil;
    }

    public double getFiyat() {
        return this.fiyat;
    }

    public boolean isMusaitlik() {
        return this.musaitlik;
    }

    public void setMusaitlik(boolean musaitlik) {
        this.musaitlik = musaitlik;
    }

    public abstract int getYolcuKapasitesi();

    public abstract void bilgiYazdir();
}