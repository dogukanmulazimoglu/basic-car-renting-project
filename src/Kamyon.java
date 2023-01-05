class Kamyon extends Arac {
    private int tasimaKapasitesi;

    public Kamyon(String marka, String model, int yil, double fiyat, int tasimaKapasitesi) {
        super(marka, model, yil, fiyat);
        this.tasimaKapasitesi = tasimaKapasitesi;
    }

    @Override
    public int getYolcuKapasitesi() {
        return 2;
    }

    public int getTasimaKapasitesi() {
        return this.tasimaKapasitesi;
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("Kamyon: " + getMarka() + " " + getModel() + " (" + getYil() + ")");
        System.out.println("Taþýma Kapasitesi: " + getTasimaKapasitesi() + " kg");
        System.out.println("Yolcu Kapasitesi: " + getYolcuKapasitesi());
        System.out.println("Fiyat: " + getFiyat() + " TL/gün");
        System.out.println("---------------------------------------------------");
    }
}