class GunlukPlan implements KiralamaPlan� {
    private Arac arac;
    private int gun;

    public GunlukPlan(Arac arac, int gun) {
        this.arac = arac;
        this.gun = gun;
    }

    @Override
    public void planiYazdir() {
        System.out.println("G�nl�k Kiralama Plan�: ");
        System.out.println("Ara�: " + arac.getMarka() + " " + arac.getModel() + " (" + arac.getYil() + ")");
        System.out.println("G�n: " + gun);
        System.out.println("Fiyat: " + arac.getFiyat() + " TL/g�n");
        System.out.println("Toplam Fiyat: " + (gun * arac.getFiyat()) +  " TL");
        System.out.println("---------------------------------------------------");
    }
}