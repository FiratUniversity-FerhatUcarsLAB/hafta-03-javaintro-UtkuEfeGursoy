public class UcgenAlanHesap {
    public static void main(String[] args) throws Exception {
        //Tanımlamalar 
        
        int a,b,c;
        double Cevre;
        a=3;
        b=4;
        c=5;
        Cevre=(a+b+c)/2;
        //Heron Formülü ilen alan hesaplama
        double Alan=Math.sqrt(Cevre*(Cevre-a)*(Cevre-b)*(Cevre*c));
        //Hesaplamalar ve Ekran Çıktıları
        System.out.printf("Üçgenin alani="+"%.2f\n",Alan);
    }   
}
