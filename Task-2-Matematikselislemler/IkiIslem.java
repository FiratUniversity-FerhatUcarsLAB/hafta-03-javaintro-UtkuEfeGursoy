public class IkiIslem {
    public static void main(String[] args)  {
       //Pay Hesaplama
       double pay=(9.5*4.5)-(2.5*3);

       //Payda Hesaplama
         double payda=45.5-3.5;
       
       //Bölme Yapma
       if (payda!=0){
             double bolme=pay/payda;
       
        //Sonucu Yazdırma 
        System.out.printf("%.4f\n", bolme);
       } else {
        System.out.println("Payda sıfır olamaz.");
       }

    }
}
