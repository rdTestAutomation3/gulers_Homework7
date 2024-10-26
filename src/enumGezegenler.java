public enum enumGezegenler {
    private final int sira; //güneşe uzaklık sırası
    private final int uzaklik;  // km cinsinden Güneşe uzaklık
    private final int yaricap;  // km cinsinden yarıçap
    private final double donmeSuresi;  // dünya günü cinsinden kendi etrafında dönme süresi

    // Constructor
    enumGezegenler(int sira, int uzaklik, int yaricap, double donmeSuresi) {
        this.sira = sira;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    // Gezegenleri tanımlayalım
    MERKUR(1, 57_910, 2_439, 58.65),
    VENUS(2, 108_200, 6_052, 243),
    DUNYA(3, 149_600, 6_371, 1),
    MARS(4, 227_940, 3_390, 1.03),
    JUPITER(5, 778_330, 69_911, 0.41),
    SATURN(6, 1_429_400, 58_232, 0.45),
    URANUS(7, 2_870_990, 25_362, 0.72),
    NEPTUN(8, 4_504_000, 24_622, 0.67);

    public int getSira(){
        return sira;
    }

    public int getUzaklik(){
        return uzaklik;
    }

    public int getYaricap(){
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }
}