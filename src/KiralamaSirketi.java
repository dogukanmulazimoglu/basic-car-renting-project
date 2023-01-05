import java.util.ArrayList;
import java.util.List;

class KiralamaSirketi {
    public List<Arac> araclar;

    public KiralamaSirketi() {
        this.araclar = new ArrayList<>();
    }

    public void aracEkle(Arac arac) {
        this.araclar.add(arac);
    }

    public void garajiGoster() {
        System.out.println("Garaj : ");
        for (Arac a : this.araclar) {
            a.bilgiYazdir();
            System.out.println();
        }
    }

    public KiralamaPlaný kiralamaPlaniOlustur(String kiralamaTipi, Arac arac, int sure) {
        System.out.println("---------------------------------------------------");
        if (kiralamaTipi.equalsIgnoreCase("saatlik")) {
            double saatlikFiyat = arac.getFiyat() / 24;
            return new SaatlikPlan(arac, sure, saatlikFiyat);
        } else if (kiralamaTipi.equalsIgnoreCase("günlük")) {
            return new GunlukPlan(arac, sure);
        } else if (kiralamaTipi.equalsIgnoreCase("haftalýk")) {
            return new HaftalikPlan(arac, sure);
        } else {
            return null;
        }
    }
}
