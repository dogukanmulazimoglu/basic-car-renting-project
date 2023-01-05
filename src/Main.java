
public class Main {
    public static void main(String[] args) {
        KiralamaSirketi SengullerOtomotiv = new KiralamaSirketi();

        SengullerOtomotiv.aracEkle(new Binek("Volkswagen", "Passat", 2020, 550, 5));
        SengullerOtomotiv.aracEkle(new Binek("BMW", "5.20", 2021, 670, 5));
        SengullerOtomotiv.aracEkle(new Kamyon("Ford", "F-150", 2020, 800, 2500));
        SengullerOtomotiv.aracEkle(new Kamyon("Volkswagen", "Amarok", 2021, 970, 3000));
        SengullerOtomotiv.aracEkle(new Ticari("Fiat","Doblo", 2018, 500, 5, 800));
        SengullerOtomotiv.aracEkle(new Ticari("Volkswagen","Caddy", 2020, 700, 5, 920));
        SengullerOtomotiv.aracEkle(new Spor("Nissan","GT-R", 2010, 1500, 315));
        SengullerOtomotiv.aracEkle(new Spor("Ferrari","458", 2012, 2000, 325));

        SengullerOtomotiv.garajiGoster();

        KiralamaPlaný kiralama = SengullerOtomotiv.kiralamaPlaniOlustur("günlük", SengullerOtomotiv.araclar.get(7), 3);
        kiralama.planiYazdir();
    }
}