class Ticari extends Arac{
    private int yolcuKapasitesi;
    private int tasimaKapasitesi;

    public Ticari(String marka, String model, int yil, double fiyat, int yolcuKapasitesi, int tasimaKapasitesi) {
        super(marka, model, yil, fiyat);
        this.yolcuKapasitesi = yolcuKapasitesi;
        this.tasimaKapasitesi = tasimaKapasitesi;
    }

    @Override
    public int getYolcuKapasitesi() {
        return this.yolcuKapasitesi;
    }

    public int getTasimaKapasitesi() {
        return this.tasimaKapasitesi;
    }

    public void bilgiYazdir() {
        System.out.println("Otomobil: " + getMarka() + " " + getModel() + " (" + getYil() + ")");
        System.out.println("Taþýma Kapasitesi: " + getTasimaKapasitesi() + " kg");
        System.out.println("Yolcu Kapasitesi: " + getYolcuKapasitesi());
        System.out.println("Fiyat: " + getFiyat() + " TL/gün");
        System.out.println("---------------------------------------------------");
    }
}
