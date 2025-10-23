import java.util.Scanner; // Scanner sınıfını içe aktarma
import java.util.ArrayList; // ArrayList sınıfını içe aktarma
public class HesapOzeti {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner nesnesi oluşturma
        //Ürünün adını Fiyatını ve  Listesini tutmak için ArrayList
        ArrayList<String> urunler = new ArrayList<String>();
        ArrayList<Double> fiyatlar = new ArrayList<Double>();
        ArrayList<Integer> adetler = new ArrayList<Integer>();
        
        //Degiskenler
        String UrunAdi;
        double UrunFiyati;
        int UrunAdedi;
        double ToplamTutar=0.0;
        System.out.print("Kac Tane Urun Aldiniz: ");
        int AlinanUrunSayisi=input.nextInt(); 
       //Kullanıcıdan Ürün Bilgilerini Alma
       for(int i=1;i<=AlinanUrunSayisi;i++) { 
        System.out.print(i+". Urun Adini Giriniz: ");
          UrunAdi=input.next(); //Urun Adi girdisi
       urunler.add(UrunAdi); //Ürün Adını listeye ekleme

        System.out.print("\n"+i+". Urun Fiyatini Giriniz: ");
         UrunFiyati=input.nextDouble(); //Urun Fiyati girdisi
        fiyatlar.add(UrunFiyati); //Ürün Fiyatını listeye ekleme
        

        System.out.print("\n"+i+". Urun Adedini Giriniz: ");
         UrunAdedi=input.nextInt(); //Urun Adedi girdisi
        adetler.add(UrunAdedi); //Ürün Adedini listeye ekleme
        ToplamTutar+=UrunFiyati*UrunAdedi; //Toplam tutara ekleme
       }
       //Hesap Özetini Yazdırma
         System.out.println("\nHESAP OZETI");
         System.out.print("Ürün Adı: ");
        for(int j=0;j<AlinanUrunSayisi;j++){
        System.out.print(urunler.get(j)+" - ");//Ürün adlarını yazdırma
       }  


       System.out.print("\n");
       System.out.print("Fiyatlar: ");
        for(int k=0;k<AlinanUrunSayisi;k++){
        System.out.print(fiyatlar.get(k)+" TL - ");//Ürün fiyatlarını yazdırma
       }


        System.out.print("\n");
        System.out.print("Adetler: ");
         
        for(int m=0;m<AlinanUrunSayisi;m++){
        System.out.print(adetler.get(m)+" Adet - ");
       }


            System.out.println("\n---------------------");
            System.out.println("                         Toplam Tutar: "+ToplamTutar+" TL");//Toplam tutarı yazdırma
            input.close(); // Scanner nesnesini kapatma
       
}
}
