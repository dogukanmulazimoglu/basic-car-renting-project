class HaftalikPlan implements KiralamaPlaný {
    private Arac arac;
    private int hafta;

    public HaftalikPlan(Arac arac, int hafta) {
        this.arac = arac;
        this.hafta = hafta;
    }

    @Override
    public void planiYazdir() {
        System.out.println("Haftalýk Kiralama Planý: ");
        System.out.println("Araç: " + arac.getMarka() + " " + arac.getModel() + " (" + arac.getYil() + ")");
        System.out.println("Hafta: " + hafta);
        System.out.println("Fiyat: " + arac.getFiyat() + " TL/gün");
        System.out.println("Toplam Fiyat: " + (hafta * 7 * arac.getFiyat()) +  " TL");
        System.out.println("---------------------------------------------------");
    }
}