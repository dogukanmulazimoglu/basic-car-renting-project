class HaftalikPlan implements KiralamaPlan� {
    private Arac arac;
    private int hafta;

    public HaftalikPlan(Arac arac, int hafta) {
        this.arac = arac;
        this.hafta = hafta;
    }

    @Override
    public void planiYazdir() {
        System.out.println("Haftal�k Kiralama Plan�: ");
        System.out.println("Ara�: " + arac.getMarka() + " " + arac.getModel() + " (" + arac.getYil() + ")");
        System.out.println("Hafta: " + hafta);
        System.out.println("Fiyat: " + arac.getFiyat() + " TL/g�n");
        System.out.println("Toplam Fiyat: " + (hafta * 7 * arac.getFiyat()) +  " TL");
        System.out.println("---------------------------------------------------");
    }
}