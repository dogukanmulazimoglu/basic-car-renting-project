class GunlukPlan implements KiralamaPlaný {
    private Arac arac;
    private int gun;

    public GunlukPlan(Arac arac, int gun) {
        this.arac = arac;
        this.gun = gun;
    }

    @Override
    public void planiYazdir() {
        System.out.println("Günlük Kiralama Planý: ");
        System.out.println("Araç: " + arac.getMarka() + " " + arac.getModel() + " (" + arac.getYil() + ")");
        System.out.println("Gün: " + gun);
        System.out.println("Fiyat: " + arac.getFiyat() + " TL/gün");
        System.out.println("Toplam Fiyat: " + (gun * arac.getFiyat()) +  " TL");
        System.out.println("---------------------------------------------------");
    }
}