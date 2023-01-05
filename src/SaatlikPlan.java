class SaatlikPlan implements KiralamaPlaný {
    private Arac arac;
    private int saat;
    private double saatlikFiyat;

    public SaatlikPlan(Arac arac, int saat, double saatlikFiyat) {
        this.arac = arac;
        this.saat = saat;
        this.saatlikFiyat = saatlikFiyat;
    }

    @Override
    public void planiYazdir() {
        System.out.println("Saatlik Kiralama Planý: ");
        System.out.println("Araç: " + arac.getMarka() + " " + arac.getModel() + " (" + arac.getYil() + ")");
        System.out.println("Saat: " + saat);
        System.out.println("Saatlik Fiyat: " + saatlikFiyat +  " TL");
        System.out.println("Toplam Fiyat: " + (saat * saatlikFiyat) + " TL");
        System.out.println("---------------------------------------------------");
    }
}