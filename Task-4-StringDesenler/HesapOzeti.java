import java.util.Scanner; // Scanner sınıfını içe aktarma
public class HesapOzeti {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner nesnesi oluşturma
       
       //Kullanıcıdan Ürün Bilgilerini Alma

        System.out.print("Urun Adini Giriniz: ");
        String UrunAdi=input.nextLine(); //Urun Adi girdisi

        System.out.print("\nUrun Fiyatini Giriniz: ");
        double UrunFiyati=input.nextDouble(); //Urun Fiyati girdisi

        System.out.print("\nUrun Adedini Giriniz: ");
        int UrunAdedi=input.nextInt(); //Urun Adedi girdisi

        //Tablo Kısmı
        System.out.println("------------------------------");
        System.out.printf("Urun Adi: %s\n",UrunAdi);
        System.out.printf("Urun Fiyati: %.2f TL\n",UrunFiyati);
        System.out.printf("Urun Adedi: %d adet\n",UrunAdedi);
        System.out.printf("Toplam Tutar: %.2f TL\n",UrunFiyati*UrunAdedi);
        System.out.println("------------------------------");
}
}
