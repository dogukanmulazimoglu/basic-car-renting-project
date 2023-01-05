public class Spor extends Arac{
    private int maxHiz;

    public Spor(String marka, String model, int yil, double fiyat, int maxHiz) {
        super(marka, model, yil, fiyat);
        this.maxHiz = maxHiz;
    }

    @Override
    public int getYolcuKapasitesi() {
        return 2;
    }

    public int getMaxHiz() {
        return this.maxHiz;
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("Otomobil: " + getMarka() + " " + getModel() + " (" + getYil() + ")");
        System.out.println("Yolcu Kapasitesi: " + getYolcuKapasitesi());
        System.out.println("Maksimum Hýz: " + getMaxHiz() + " km/saat");
        System.out.println("Fiyat: " + getFiyat() + " TL/gün");
        System.out.println("---------------------------------------------------");
    }
}
