class Binek extends Arac {
    private int yolcuKapasitesi;

    public Binek(String marka, String model, int yil, double fiyat, int yolcuKapasitesi) {
        super(marka, model, yil, fiyat);
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public int getYolcuKapasitesi() {
        return this.yolcuKapasitesi;
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("Otomobil: " + getMarka() + " " + getModel() + " (" + getYil() + ")");
        System.out.println("Yolcu Kapasitesi: " + getYolcuKapasitesi());
        System.out.println("Fiyat: " + getFiyat() + " TL/gün");
        System.out.println("---------------------------------------------------");
    }
}