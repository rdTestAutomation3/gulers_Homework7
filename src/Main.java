
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        System.out.println("Gezegenler Güneşe Uzaklık Sırasına Göre Aşağıda Listelenmiştir :");
        //foreach döngüsü ile ekrana gezengelerin bilgilerini yazdıralım.
        for (enumGezegenler gezegenler : enumGezegenler.values()) {
            System.out.println("Gezegen Adı : " + gezegenler.name());
            System.out.println("Güneşe yakınlık sırası : " + gezegenler.getSira());
            System.out.println("Güneşe uzaklığı : " + gezegenler.getUzaklik() + "000 KM");
            System.out.println("Yarıçapı : " + gezegenler.getYaricap() +" KM");
            System.out.println("Kendi Etrafında Dönme Süresi : " + gezegenler.getDonmeSuresi() +" Dünya Günü");
            System.out.println("   ");
    }
}
